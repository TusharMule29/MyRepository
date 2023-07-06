package Day25jun23;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FriendlyLocatores {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		WebElement element = driver.findElement(By.id("opentab"));
		
		WebElement ele = driver.findElement(
				with(By.tagName("legend")).toLeftOf(element));
		System.out.println("toLeftOf legend: " + ele.getText());
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		ele = driver.findElement(with(By.tagName("legend")).toRightOf(element));
//		System.out.println("to right of element : " + ele.getText());
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		ele = driver.findElement(with(By.tagName("legend")).above(element));
		System.out.println("above the element : " + ele.getText());
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		ele = driver .findElement(with(By.tagName("legend")).below(ele));
		System.out.println("below the element : " + ele.getText());
		
		ele = driver.findElement(with(By.tagName("legend")).near(element));
		System.out.println("near the element : " + ele.getText());
	
// 		no such element found exception
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement element2 =driver.findElement(By.xpath("//div[@id='select-class-example']//legend"));
//		WebElement ele2 = driver.findElement(with(By.tagName("option")).near(element2));
//		System.out.println("element 2 is near by : " + ele2.getText());
//		
		
		// WebTable friendly locators
		WebElement element4 = driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[3]"));
		System.out.println("element2.getText() =>" + element4.getText()); //30
		ele = driver.findElement(with(By.tagName("td")).near(element4));
		System.out.println("near text: " + ele.getText()); //35
		
		element4 = driver.findElement(By.xpath("//*[@id='product']/tbody/tr[4]/td[3]"));
		ele = driver.findElement(with(By.tagName("td")).near(element4));  // 25
		System.out.println("25 near text: " + ele.getText()); //30

		
		
	}

}
