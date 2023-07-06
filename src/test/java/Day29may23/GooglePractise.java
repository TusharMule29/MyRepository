package Day29may23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglePractise {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
	    
	    Thread.sleep(5000l);
//	 WebElement txtElement =    driver.findElement(By.name("q"));
//	 txtElement.sendKeys("Mumbai Indians");
//	    
	 
	 
	 WebElement txt = driver.findElement(By.id("APjFqb"));
	 txt.sendKeys("I love Indore City");
	 Thread.sleep(5000l);
	    txt.clear();
	    
	    //driver.navigate().refresh();
	    

       
     //   # Create an instance of the Actions class
       Actions  actions = new Actions(driver);

       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //actions.keyDown(Keys.LEFT_SHIFT).sendKeys(Keys.F5).keyUp(Keys.LEFT_SHIFT).build().perform();
	   
	    
	    JavascriptExecutor js = (JavascriptExecutor)(driver);
	    js.executeScript("location.reload();");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

}
