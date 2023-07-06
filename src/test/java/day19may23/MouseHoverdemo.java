package day19may23;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement btnMousehover =driver.findElement(By.id("mousehover"));
			Actions action = new Actions(driver);
		btnMousehover.getText();
		
		action.moveToElement(btnMousehover).build().perform();
		
		driver.findElement(By.xpath("(//div[@class='mouse-hover-content']/a)[1]")).click();
		Thread.sleep(5000l);

		action.moveToElement(btnMousehover).build().perform();
		driver.findElement(By.xpath("//a[2]")).click();
		Thread.sleep(4000l);
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
