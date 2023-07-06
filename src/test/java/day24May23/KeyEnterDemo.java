package day24May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEnterDemo {

	public static void main(String[] args) throws InterruptedException {

		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000l);
		driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
	}

}
