package day10May23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement btnOpenWindow = driver.findElement(By.xpath("//fieldset//button[@id='openwindow']"));
		 			btnOpenWindow.click();
		btnOpenWindow.click();
		
		Set<String> windIds = driver.getWindowHandles();
		Iterator<String>iter = windIds.iterator();
		String pwinId = iter.next();
		System.out.println("parent window id :" + pwinId);
		String cwinId = iter.next();
		System.out.println("child window id :" + cwinId);
		
		driver.switchTo().window(cwinId);
		String childActUrl = driver.getCurrentUrl();
		
		String childExpUrl = "https://www.letskodeit.com/courses";
		Thread.sleep(5000l);
		
		driver.switchTo().window(pwinId);
		String parentActUrl = driver.getCurrentUrl();
		Thread.sleep(4000l);
		String parentExpUrl = "https://www.letskodeit.com/practice";
		Thread.sleep(4000l);
		
		
		if(childActUrl.equals(childExpUrl))
			System.out.println(" test case passed #1");
		else
			System.out.println(" test case failed# 1 ");
		
		if(parentActUrl.equals(parentExpUrl))
			System.out.println("test case passed # 2");
		else
			System.out.println(" test case failed #2");
		
		driver.quit();
		
	}

}
