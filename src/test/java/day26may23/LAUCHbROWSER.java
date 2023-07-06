package day26may23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LAUCHbROWSER {
	
	public static void main(String[] args) {

//	Browser [] br = Browser.values();
//	for(Browser x:br)
//		System.out.println(x);
		
	Browser b = Browser.Edge;
	WebDriver driver ;
	driver = new EdgeDriver();
	
	 switch (b)
	 {
	 case  Chrome: 
		  driver.get("https://www.google.co.in/");
		 System.out.println("i am open the google application");
		 break;
		
	 case Firefox:
		 driver.get("https://www.facebook.com/login/");
		 System.out.println(" i am open the facebook application");
	break;
	 
	 case Edge: 
		  driver.get("https://www.bing.com/search?FORM=U523DF&PC=U523&q=amazon+online+shopping");
		 System.out.println("i am open the Amzon application");
		 break;
	 }
	
	}

}
