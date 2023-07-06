package day19may23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txtElement =driver.findElement(By.id("enabled-example-input"));
		txtElement.clear();
		txtElement.sendKeys("tushar");
		boolean res = 	txtElement.isEnabled();
		
		System.out.println(" res is enable :" + res);
		Thread.sleep(4000l);
		
		WebElement btndisable = driver.findElement(By.id("disabled-button"));
	
		btndisable.click();
		res=  txtElement.isEnabled(); 
		System.out.println(" res  button is Enable :" + res);
		Thread.sleep(4000l);
		
		WebElement  BtnEnable  = driver.findElement(By.id("enabled-button"));
		BtnEnable.click();
		res = txtElement.isEnabled();
		System.out.println(" res : Enable " + res);
		Thread.sleep(4000l);
		
		txtElement .clear();
		Thread.sleep(4000l);
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
