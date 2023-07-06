package day5june23;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_practice {

	private static final String FILE = null;

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String destFile = System.getProperty("user.dir")+"\\src\\test\\java\\day5june23\\Error_.png";
		
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File sourceFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		CaptureScreenshot(sourcefile,destFile);
		driver.quit();
		
	}
		
		static void CaptureScreenshot(File sourcefile, String destFile)throws IOException
		{
			
			Date dt = new Date();
			destFile = destFile + dt.toString().replace(" ","_").replace(":", "_")+".jpg";
			System.out.println(destFile);
		}

		
	}


