package day10May23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement btnOpenWindow = driver.findElement(By.xpath("//fieldset//button[@id='openwindow']"));
		 			btnOpenWindow.click();
		btnOpenWindow.click();
		
		Set<String> windIds = driver.getWindowHandles();		
		Iterator<String> iter = windIds.iterator();
		String PwindId = iter.next();
		System.out.println("PwindId : " + PwindId);
		String CwindId =iter.next();
		System.out.println("CwindId : " + CwindId);
		
		driver.switchTo().window(CwindId);
		String ActCwind = driver.getCurrentUrl();
		String ExpCwind = "https://www.letskodeit.com/courses";
		if(ActCwind.equals(ExpCwind))
			System.out.println(" test case passed #1");
		else 
			
			System.out.println(" test case failed # 1");
		
		
		driver.switchTo().window(PwindId);
		String ActPwind = driver.getCurrentUrl();
		String ExpPwind = "https://www.letskodeit.com/practice";
		if(ActPwind.equals(ExpPwind))
			System.out.println("test case passed #2");
		else
			System.out.println(" test case failed # 2");
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
