package day24May23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String s1 = "tarun";
		String s2 = "shubham";
		String s3 = "prasad";
		String s4 = "heetarth";
		String s5 = " tushar";
		driver.findElement(By.name("s")).sendKeys(s1,s2,s3,s4,s5);

	
		
	}

}
