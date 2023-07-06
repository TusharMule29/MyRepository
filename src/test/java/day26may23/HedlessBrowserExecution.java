package day26may23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HedlessBrowserExecution {

	
		static void launchurl(WebDriver driver)
		{
			  driver.get("https://www.google.com");
			  System.out.println("title :  " + driver.getTitle());
			  System.out.println("url   : " + driver.getCurrentUrl());
		}
		
		public static void main(String[] args) throws InterruptedException {

	
			 // driver.quit();
				ChromeOptions option = new ChromeOptions();
				option.setHeadless(true);
				option.addArguments("--headless");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com");
				 System.out.println("title :  " + driver.getTitle());
				  System.out.println("url: " + driver.getCurrentUrl());
		
//	 Firefox headless 
//			  FirefoxOptions option = new FirefoxOptions(); 
//			  option.setHeadless(true); 
//			  option.addArguments("--headless");
//			  WebDriver driver=new FirefoxDriver(option);
//			  launchurl(driver);
			  
			  
//			 EdgeOptions option = new EdgeOptions(); 
//		  option.setHeadless(true);
//			  option.addArguments("--headless");
//			  WebDriver driver = new EdgeDriver(option);
//			  launchurl(driver);
//		
			 
	}

}
