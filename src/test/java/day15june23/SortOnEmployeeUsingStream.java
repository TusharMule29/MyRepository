package day15june23;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortOnEmployeeUsingStream {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// click on tha admin button
		driver.findElement(By.xpath("(//nav[@role='navigation']//a)[2]")).click();
		//choose on ascending order
		driver.findElement(By.xpath("(//div[@role='columnheader']/div[@class='oxd-table-header-sort'])[3]")).click();
		
		// click on asceding button 
		driver.findElement(By.xpath("(//div[@role='dropdown']//span)[5]")).click();
		
		// select coloumn in ascending order
	List<WebElement> low =driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell' and @role='cell'][4]"));
		
	List<String> lowString = low.stream().map(s->s.getText()).collect(Collectors.toList());
		//ascending ,defect not asc 
	System.out.println("actual asc list: ");
	
	int cnt =1;
	for(String s : lowString)
	System.out.println(cnt++ + " :" + s);
	
	System.out.println("***********************");
	
	
	List<String> lowSortedString = lowString.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		cnt=1;
	System.out.println("exp asc list : ");
	System.out.println("***************************************");
	Assert.assertEquals(lowString ,lowSortedString ,"both list are not matching");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
