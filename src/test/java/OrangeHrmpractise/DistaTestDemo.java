package OrangeHrmpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DistaTestDemo {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
		
		String actUrl = "https://dista.ai/";
		driver.get(actUrl);
		driver.manage().window().maximize();
		String ExpUrl =  driver.getCurrentUrl();
		if(actUrl.equals(ExpUrl))
			System.out.println(" url is correct and browser is open");
		else
			System.out.println(" browser is not open and url is not correct");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Thread.sleep(1000l);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);", "");
		Thread.sleep(10000l);
//		
		WebElement txtElement50k =	driver.findElement(By.xpath("(//span[@class='elementor-counter-number'] [@data-to-value='50'])[1]"));
		WebElement Textelement = driver.findElement(By.xpath("(//span[@class='elementor-counter-number-suffix'] )[1]"));
		String txt = txtElement50k.getText();
		System.out.print( "field Assces " + txtElement50k + Textelement);
		
		// to print title
			WebElement txtTitle =driver.findElement(By.xpath("(//div[@class='elementor-counter-title'])[1]"));
			String txtEle2 = txtTitle.getText();
		 System.out.print(txtEle2);
		//
		 
		 System.out.println(txt+txtEle2);
	driver.quit();
		
//		// full title
//		WebElement txtFullTitle1	= driver.findElement(By.xpath("(//div[@class='elementor-counter-number-wrapper'])[1]"));
//		System.out.println(txtFullTitle1.getText());
		
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtFullTitle2 = driver.findElement(By.xpath("(//div[@class='elementor-counter-number-wrapper'])[2]"));
		System.out.println(txtFullTitle2.getText());
		
		WebElement txtFulltxtTitle3 = driver.findElement(By.xpath("(//div[@class='elementor-counter-title'])[2]"));
		System.out.println( txtFulltxtTitle3.getText());
		
	//	driver.findElement(By.xpath(ExpUrl))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
