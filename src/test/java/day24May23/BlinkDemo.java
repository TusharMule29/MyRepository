package day24May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to change the type of the website
		Thread.sleep(8000l);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		
		js.executeScript("arguments[0].setAttribute('style','background:red;border:15px solid blue;');",txtFirstName);
		
		txtFirstName .sendKeys("cyber");
		Thread.sleep(3000l);
		
		js.executeScript("arguments[0].setAttribute('style','background: white; border:1px solid grey;');",txtFirstName);
		
		Thread.sleep(8000l);
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		js.executeScript("arguments[0].setAttribute('style','background: pink; border:5px dashed orange;');",txtLastName);
		
		txtLastName.sendKeys("success");
		Thread.sleep(4000l);
		
		js.executeScript("arguments[0].setAttribute('style','background: pink; border:1px solid grey;');",txtLastName);
		
		Thread.sleep(4000l);
		WebElement  txtEmail = driver.findElement(By.name("reg_email__"));
		
		Thread.sleep(4000l);
		js.executeScript("arguments[0].setAttribute('style','background: white; border:1px solid grey;');",txtEmail);
		txtEmail.sendKeys("Cs@gmail.com");
		
		Thread.sleep(4000l);
		String val = driver.findElement(By.name("firstname")).getAttribute("value");
		System.out.println(val);
		
		String txt = driver.findElement(By.name("firstname")).getText();
		System.out.println(txt); // will not have any value
		System.out.println(txtFirstName.getCssValue("background-color"));
		System.out.println(txtLastName .getCssValue("background-color"));
		System.out.println(txtEmail .getCssValue("background-color"));

	
		
	}

}
