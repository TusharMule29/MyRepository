package Day29may23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classdemo1 {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
	
	driver = new ChromeDriver();

	//# Open the webpage
	driver.get("https://www.google.co.in/");
	Thread.sleep(5000l);
//	# Simulate the F5 key press to refresh the page
	driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
	Thread.sleep(5000l);
	
	driver.quit();

}

}
