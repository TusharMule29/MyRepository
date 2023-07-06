package OrangeHrmpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdemo {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
		
		String actUrl = "https://www.facebook.com/";
		driver.get(actUrl);
		driver.manage().window().maximize();
		String ExpUrl =  driver.getCurrentUrl();
		if(actUrl.equals(ExpUrl))
			System.out.println(" url is correct and browser is open");
		else
			System.out.println(" browser is not open and url is not correct");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to change the type of the website
		Thread.sleep(8000l);
		WebElement txtFirstName = driver.findElement(By.name("firstname"));
		txtFirstName .sendKeys("Rohit");
		Thread.sleep(3000l);
		System.out.println("Cyber");
		
		WebElement txtLastName = driver.findElement(By.name("lastname"));
		txtLastName.sendKeys("Harshal");
		Thread.sleep(3000l);
		System.out.println("Success");
		//
		WebElement  txtEmail = driver.findElement(By.name("reg_email__"));
		txtEmail.sendKeys("Harshal@gmail.com");
		System.out.println("cyber@gmail.com");
		
		Thread.sleep(8000l);
		
		WebElement txtConfimPass = driver.findElement(By.xpath("//div[@id='reg_form_box']/descendant::div[22]//input"));
		txtConfimPass.sendKeys("Harshal@gmail.com");
		Thread.sleep(4000l);
		System.out.println("cyber@gmail.com");
		
	WebElement txtNewpass = driver.findElement(By.id("password_step_input"));
		txtNewpass.sendKeys("cyber@123");
		System.out.println("cyber@123");
		
		Thread.sleep(4000l);
		WebElement dropDownDay = driver.findElement(By.name("birthday_day"));
		// multiple drop down list for day
			Select select = new Select(dropDownDay);
		//	System.out.println("is multiple :" + select.selectBy);
			 select.selectByIndex(3);
			 System.out.println("3");
				// select.selectByIndex(1);
				 //select.selectByIndex(2);
				 
			 Thread.sleep(4000l);
				 // drop down list for month
		WebElement dropDownMonth = driver.findElement(By.name("birthday_month"));
		Select select1 = new Select(dropDownMonth);
		 select1.selectByIndex(3);
		 System.out.println("3");
		 // drop down list for year
		 Thread.sleep(4000l);
		 WebElement dropDownYear = driver.findElement(By.name("birthday_year"));
			Select select2 = new Select(dropDownYear);
			 select2.selectByIndex(3);
			 System.out.println("3");
		
			 Thread.sleep(4000l);
			WebElement Malebtn = driver.findElement(By.xpath("//span[2]//label[@class='_58mt']"));
	
	
	
	}

}
