package day9may23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProgram {

	public static void main(String[] args) {
String url = "https://www.letskodeit.com";
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	System.out.println(driver.getTitle());
	
		
		
		
		
		
		
		
		
	}

}
