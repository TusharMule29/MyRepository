package day14jun23;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowsizeDemo {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.3");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//
		
		//return x and  y position 
		Point getPos = driver.manage().window().getPosition();
		System.out.println(getPos.getX()+"::y =" + getPos.getY()+":: x = " + getPos.x + " :: y = " + getPos.y);
		
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println("dim.getwidth() ==> " + dim.getWidth());
		System.out.println("dim.getHeight() == > " + dim.getHeight());
		
		System.out.println("driver.getWidth()==>" + driver.manage().window().getSize().getWidth());
		System.out.println("driver.getHeight()==>" + driver.manage().window().getSize().getHeight());
		
		driver.manage().window().maximize();
		System.out.println("after maximaizing");
		
		System.out.println("driver.getHeight()==>" + driver.manage().window().getSize().getHeight());
		System.out.println("driver.getWidth()==>" + driver.manage().window().getSize().getWidth());
		
		//
	/*	System.out.println("after setting window size: ");
		
		Dimension d = new Dimension(750,800);
		//width,height
		// Resize the current window to given dimension
		driver.manage().window().setSize(d);
		
		System.out.println("driver.height ==>> " + driver.manage().window().getSize().height);
		
		System.out.println("driver.width==>>" + driver.manage().window().getSize().width);
		
//	driver.manage().window().maximize();
		
		int windowHeight = driver.manage().window().getSize().getHeight();
		System.out.println("windowHeight : " + windowHeight);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0," + windowHeight + ")","");
		
		
		*/	
		
	}

}
