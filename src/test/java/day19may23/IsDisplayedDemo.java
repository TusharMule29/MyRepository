package day19may23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		WebElement textElement = driver.findElement(By.id("displayed-text"));
		textElement.clear();
		textElement.sendKeys("tushar");
		boolean res = textElement .isDisplayed();
		System.out.println(" res  is displeyed : " + res);
		Thread.sleep(3000l);
		
		driver.findElement(By.id("hide-textbox")).click();;
		res = textElement.isDisplayed();
		System.out.println(" res : displayed " + res);
		Thread.sleep(3000l);
		
		driver.findElement(By.id("show-textbox")).click();
		res = textElement.isDisplayed();
		System.out.println(" res : displayed " + res);
		Thread.sleep(3000l);
		
		textElement.clear();
		textElement.click();
	
		Thread.sleep(3000l);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
