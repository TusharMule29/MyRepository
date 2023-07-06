package Day25jun23;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ViewMobileDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
//		Map<String, Object> deviceMetrics = new HashMap<>();
//		deviceMetrics.put("width", 300);
//		deviceMetrics.put("height", 500);
//		deviceMetrics.put("deviceScaleFactor", 25);
//		deviceMetrics.put("mobile", true);
//		
		Map<String ,Object > deviceMetics = new HashMap<>();
		deviceMetics.put("width", 300);
		deviceMetics.put("height", 500);
		deviceMetics.put("deviceScaleFactor", 25);
		deviceMetics.put("mobile", true);
		
		
		
		
	//	Emulation.setDeviceMetricsOverride===>> it is a  key for CdpCommamnd
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetics);
		
	 	driver.get("https://www.w3schools.com/");
		//	driver.get("https://amazon.com");
		
	}

}
