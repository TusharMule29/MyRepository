package day10May23;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WnidowsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement btnOpenWindow = driver.findElement(By.xpath("//fieldset//button[@id='openwindow']"));
		 			btnOpenWindow.click();
		 			
		 		Set<String> windIds = driver.getWindowHandles();
		 		Iterator <String> iter = windIds.iterator();
	String pwindId = iter.next();
		System.out.println( "parent wind Id:  " +  pwindId);
		String cwinId =iter.next();
		System.out.println(" child wind Id : " + cwinId);
		Thread.sleep(4000l);
		
		driver.close();
		
		driver.switchTo().window(cwinId);
		String childActUrl = driver.getCurrentUrl();
		String childExpUrl = "https://www.letskodeit.com/courses";
		
		Thread.sleep(4000l);
		//driver.close();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().window(pwindId);
		String parentACtUrl = driver.getCurrentUrl();
		String parentExpUrl = "https://www.letskodeit.com/practice";
		
		if(childActUrl.equals(childExpUrl))
			System.out.println(" test case passed #1 ");
		else
			System.out.println(" test case failed #1");
		
		if(parentACtUrl.equals(parentExpUrl))
			System.out.println(" test case passed # 2");
		else
			System.out.println(" test case failed # 2");
		
		Thread.sleep(3000l);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
