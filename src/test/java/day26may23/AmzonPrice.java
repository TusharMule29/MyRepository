package day26may23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonPrice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);

		driver.manage().window().maximize();
		// clicking on best seller
		driver.findElement(By.xpath("(//div[@id='nav-xshop']//a)[3]")).click();
		
		// get header label
		String hdrLabel = driver.findElement(By.id("zg_banner_text")).getText();
		System.out.println(hdrLabel);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.xpath("(//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated'])[3]")).click();
		
		Thread.sleep(6000l);
		String price = driver.findElement(By.xpath("((//div[@id='corePriceDisplay_desktop_feature_div'])//div[1]//span[2])[1]")).getText();
		System.out.println("price: " + price);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
