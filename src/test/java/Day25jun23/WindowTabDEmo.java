package Day25jun23;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTabDEmo {

	public static void main(String[] args) {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.letskodeit.com/practice");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Set<String> windHandles = driver.getWindowHandles();
//		Iterator<String> windIds = windHandles.iterator();
//		String pWindId = windIds.next();
//		String cWindId = windIds.next();
//		driver.switchTo().window(cWindId);
//		driver.get("https://www.letskodeit.com/courses");
//		String newWindowUrl = driver.getCurrentUrl();
//		System.out.println("newWindowUrl: "+ newWindowUrl);
//		driver.switchTo().window(pWindId);		
//		String homeWindowUrl = driver.getCurrentUrl();
//		System.out.println("homeWindowUrl: "+ homeWindowUrl);
//		
//		driver.quit();
//		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String>winIds = winhandles.iterator();
		String pwinIds = winIds.next();
		String cwinIds = winIds.next();
		driver.switchTo().window(cwinIds);
		driver.get("https://www.letskodeit.com/courses");
		String newWindowUrl = driver.getCurrentUrl();
		System.out.println("newWindoeUrl : " + newWindowUrl);
		driver.switchTo().window(pwinIds)	;	
		String homeWindowUrl =driver.getCurrentUrl();
		System.out.println("homeWindowUrl: "  + homeWindowUrl);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
