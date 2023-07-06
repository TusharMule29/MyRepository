package day5june23;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotdemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","" );
		
		String desFile = System.getProperty("user.dir")+"\\src\\test\\java\\day5june23\\ScriptError_";
		
		File sourceFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Byte ,BASE64 ,FILE
		
		captureScreenshot(sourceFile,desFile);
		driver.quit();
		
	}
	static void captureScreenshot(File sourceFile,String desFile) throws IOException
	{
		Date dt = new Date(0);
		desFile = desFile + dt.toString().replaceAll("", "_").replaceAll(":", "_")+".jpg";
		System.out.println("desFile :" + desFile);
		
		FileUtils.copyFile(sourceFile,new File(desFile));
		
	}
		
		
	}


