package OrangeHrmpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DistaClass2 {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
		
		String actUrl = "https://dista.ai/";
		driver.get(actUrl);
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000l);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);", "");
		Thread.sleep(10000l);
//		
		String fitfyk = "50";
		
		WebElement txtElement50k =	driver.findElement(By.xpath("(//div[@class='elementor-counter-number-wrapper'])[1]"));
		String txt = txtElement50k.getText();
		System.out.print(txt);	
		
		
		
		
		
	}

}
