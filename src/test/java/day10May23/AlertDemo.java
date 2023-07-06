package day10May23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement txtName = driver.findElement(By.xpath("//input[@id='name'][@name='enter-name']"));
		
		txtName.sendKeys("rahul");
		
		WebElement btnAlert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		
		btnAlert.click();
		Thread.sleep(4000l);

		
		driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		// confirm button
		txtName.sendKeys("lakahan");
		
		driver.findElement(By.xpath("//div[3]/div[3]//input[3]")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(4000l);
		
		System.out.println(alert.getText());
	//	alert.accept();
		alert.dismiss();
		
		
		
		
		
		
		
	}

}
