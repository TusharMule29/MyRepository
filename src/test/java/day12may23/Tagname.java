package day12may23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demo.openmrs.org/openmrs/login.htm";
		
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
/*		List<WebElement> low = */driver.findElement(By.id("username")).sendKeys("rushikesh");
									Thread.sleep(4000l);
									driver.findElement(By.id("password")).sendKeys("patil");
								Thread.sleep(4000l);
	//	System.out.println(low.size());	
//	low.get(0).click();
	String expUrl = "https://demo.openmrs.org/openmrs/login.htm";
	String actUrl = driver.getCurrentUrl();
	if(actUrl.equals(expUrl))
		System.out.println("first link is working");
	else
		System.out.println(" first link is not working");
	
	 driver.findElement(By.className("Login"));
	System.out.println("ele : ==>>>" + driver.getTitle());
	driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
