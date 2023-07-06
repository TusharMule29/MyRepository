package day15june23;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practiseOfAllProgramm {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='app']//ul/li[1]/a")).click();
		
	//	Click on the search button
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("D");
		
		List <WebElement> low = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li/a"));
		System.out.println("size : " + low.size());
		
		List<WebElement> filteredList = low.stream().filter(s->s.getText().toUpperCase().contains("D")).collect(Collectors.toList());
		System.out.println(filteredList.size());
		
		Assert.assertEquals(low, filteredList ,"both are mismatch !!!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
