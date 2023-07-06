package day14jun23;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowResizePratise {

	public static void main(String[] args) {
	WebDriver driver= new EdgeDriver();
	driver.get("https://deluxe-menu.com/popup-mode-sample.html");
	driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.3");
	
	Point pm = driver.manage().window().getPosition();
		
	System.out.println(pm.getX()+ "::y = " + pm.getY()+ " :: x =" + pm.x + " ::y "+ pm.y);

	Dimension dm=	driver.manage().window().getSize();
	
	System.out.println("dm.getwidth()"+ dm.getWidth());	
	System.out.println("dm.getHeight()" + dm.getHeight());
	
	System.out.println(driver.manage().window().getSize().getHeight());
	System.out.println(driver.manage().window().getSize().getWidth());
	
	driver.manage().window().maximize();
	System.out.println("after maximizing");
	
	System.out.println(driver.manage().window().getSize().getWidth());
	System.out.println(driver.manage().window().getSize().getHeight());	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
