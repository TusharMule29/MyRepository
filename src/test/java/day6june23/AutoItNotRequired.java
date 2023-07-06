package day6june23;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItNotRequired {

	public static void main(String[] args) throws IOException ,InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		// Enter file to upload using window's open dialouge window
		
		// not at all required as choose file is a input Tag with type-File ,we can not click on 
		// such Element ,can Sendkeys a file along with its path
		
		Thread.sleep(4000l);
		
		driver.findElement(By.xpath("//*[@id='file-upload']")).sendKeys(args);
		
		
		
		
		
		
		
	}

}
