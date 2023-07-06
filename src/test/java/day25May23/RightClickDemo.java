package day25May23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.get("https://deleux-menu.com/popup-mode-sample.html");
	
	Thread.sleep(5000l);
		
	WebElement imageElement =  driver.findElement(By.xpath("(//p[@align='center']/img)[2]"));
	Actions action = new Actions(driver);
	
	action.moveToElement(imageElement).contextClick().build().perform();
	driver.findElement(By.id("dm2m1i1tdT")).click();
	driver.findElement(By.id("dm2m2i1tdT")).click();
	driver.findElement(By.id("dm2m3i1tdT")).click();
	
	Set<String> windIds = driver.getWindowHandles();
	System.out.println("no of window handles :" + windIds.size());
		
	Iterator<String> iter = windIds.iterator();
	String pwindIds = iter.next();
	String cwindIds = iter.next();
	System.out.println("pwinds : " + pwindIds);
		System.out.println("cwindIds : " + cwindIds);
		
		driver.switchTo().window(cwindIds);
		String actUrl =driver.getCurrentUrl();
		String expUrl = "https://deluxe-menu.com/installation-info.html";
		if(actUrl.equals(expUrl))
			System.out.println("test case passed#1");
		
		else
			System.out.println("test case failed # 1");
		
		String actHdr = driver.findElement(By.xpath("//strong")).getText();
		String expHdr = "Menu Script Installation";
		
		if(actHdr.equals(expHdr))
			System.out.println("test case passed#2");
		else
			System.out.println("test case failed # 2");
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
