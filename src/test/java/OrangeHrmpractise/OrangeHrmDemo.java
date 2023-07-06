package OrangeHrmpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		String actUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(actUrl);
		driver.manage().window().maximize();
		String ExpUrl =  driver.getCurrentUrl();
		if(actUrl.equals(ExpUrl))
			System.out.println(" url is correct and browser is open");
		else
			System.out.println(" browser is not open and url is not correct");
		// enter the text in the username
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(" i enter the username as a Admin");
		
		// enter the text in the password field
		WebElement pass = driver.findElement(By.name("password"));
		  pass.sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(pass.getText());
		System.out.println(" i enter the password as a admin123");
		
		// click on the login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(" i click on the login button");
		
		 // click on the PIM module
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		System.out.println(" i click on the PIM module");
		
		// click on the add button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 driver.findElement(By.xpath("(//*[@id='app']/div/div[2]//div/div/button)[2]")).click();
		System.out.println(" i click on the add button");
		
		// enter the first/name  in text field
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Yuvraj");;
		System.out.println(" i enter the first name as Yuvraj");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Singh");
		System.out.println(" i enter the lastname as Singh");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id='app']//div[2]//form/div[1]/div[2]/div/div[2]/div//input")).sendKeys("1111");		
		System.out.println(" i enter the emp id as 1111");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[2]")).click();
		System.out.println(" i click on the save button");
		
		
		driver.navigate().back();
		Thread.sleep(4000l);
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		System.out.println(" i click on the PIM module");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Yuvraj Singh");
		System.out.println(" click on the emp name hint button");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		System.out.println(" click on the search button");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div")).click();
		System.out.println(" i click on the yuvraj singh path from list");
		
		Thread.sleep(8000);
		String ActName = driver.findElement(By.xpath("//h6[@class ='oxd-text oxd-text--h6 --strong']")).getText();
		System.out.println(ActName);
		
		String ExpName = "Yuvraj Singh";
		if(ActName.equals(ExpName))
			System.out.println("original and expected name is same ");
		else
			System.out.println(" original and expected name is not same ");
		
		
		// verification of the candidate
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
		System.out.println(" i am click on the recruitment module");
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		System.out.println(" i click on the add button");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='firstName']")).sendKeys("Virat");
		System.out.println("i enter the firstName is Virat");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='lastName']")).sendKeys("Kohli");
		System.out.println("i enter the lastName is Kohli");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("CS@gmail.com");
		System.out.println(" i enter the email Id");
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])")).click();
		System.out.println(" i click on the save button");
		
		Thread.sleep(8000);
		String ActCandName = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).getText();
		System.out.println(ActCandName);
	
		String ExpCandName ="Virat Kohli";
		if(ActCandName.equals(ExpCandName))
			System.out.println("original and expected name is same ");
		else
			System.out.println(" original and expected name is not same ");
	
	}

}
