package day11may23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebhandlingDemo {

	public static void main(String[] args) throws InterruptedException {

String url = "https://www.letskodeit.com/practice";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		////table[@id='product']/tbody/tr[3]/td[2]
		
		//tbody/tr[3]/td[2]
		
		//tr[3]/td[2]
		
	//	(//table[@id='product']//td[2])[2]
		
		WebElement  elementWt = driver.findElement(By.xpath("//table[@id='product']//tr[3]/td[2]"));
		elementWt.click();				////table[@id='product']//tr[3]/td[2]
		Thread.sleep(4000l);
		System.out.println(elementWt.getText());
		
		
		
		
		
		
		
	}

}
