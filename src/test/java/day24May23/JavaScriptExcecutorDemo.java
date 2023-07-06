package day24May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutorDemo {

	public static void main(String[] args) {

		
		
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//scroll down by javaScript Executor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000);","");
		
		// scroll up by using javascrpit executor
		js.executeScript("window.scrollBy(0,-2000);","");
		
		
		
		// sendkeys /entering text into text field using java scriptExecutor
		WebElement txtserach  = driver.findElement(By.name("s")); 
		js.executeScript("arguments[0].value='Tarun heetarth';",txtserach);
		
		// clicking using java script executor
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
