package OrangeHrmpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeDemo {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		String Browser="Firefox";
		
		if(Browser.equals("Chrome")) 
			driver=new ChromeDriver();
			else if(Browser .equals("Edge"))
			driver = new EdgeDriver();
			else {
			driver = new FirefoxDriver();
		}
	
	driver.get("https://demo.actitime.com/login.do");
		driver.getCurrentUrl();
		
		Thread.sleep(5000l);
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(5000l);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(5000l);
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("addTaskButtonId")).click();
		driver.findElement(By.xpath("(//div[@class='searchFilterPlaceholder '])[4]")).click();
		
		
		
		
		
	}

}
