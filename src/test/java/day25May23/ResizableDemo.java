package day25May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {

	public static void main(String[] args) {

		String url = "https://jqueryui.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click on resizable link
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Resizable")).click();
		
		String expUrl = "https://jqueryui.com/resizable/";
		String actUrl = driver.getCurrentUrl();
		if(expUrl.equals(actUrl))
			System.out.println("test step passed");
		else
			System.out.println("test case failed");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);", "");
	
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		 action.clickAndHold(resizable).moveByOffset(150, 250).release().build().perform();
		
	
		
		
		
		
		
		
		
		
	}

}
