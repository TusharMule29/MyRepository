package day25May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableDemo {

	public static void main(String[] args) {

		String url = "https://jqueryui.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@id='content']/following-sibling:div::div//ul//li[2]/a)[1]")).click();
		//switch to frame
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
//	 action.clickAndHold(draggable).moveToElement(Droppable).release().build().perform();
		
	action.clickAndHold(draggable).moveToElement(Droppable,20,20).release().build().perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
