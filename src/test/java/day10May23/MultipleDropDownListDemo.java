package day10May23;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownListDemo {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.letskodeit.com/practice";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		WebElement multipleDropdownList = driver.findElement(By.id("multiple-select-example"));
		// multiple drop down list sathi
		Select select = new Select(multipleDropdownList);
		System.out.println("is multiple :" + select.isMultiple());
		
	//	 select.selectByIndex(0);
		// select.selectByIndex(1);
		 //select.selectByIndex(2);
		
		List<WebElement> low = select.getOptions();
		for(int i = 0;i<low.size();i++)
			select.selectByIndex(i);
		Thread.sleep(4000l);
		
		select.deselectByIndex(1);
		
		List<WebElement > selectalloptions = select.getAllSelectedOptions();
		// 3
		System.out.println(selectalloptions.size());
		System.out.println("selected options - >");
		
		for(WebElement x: selectalloptions)
			System.out.println(x.getText());
		// 
		// error coming
		
		//want to print all options present in the list with explist
		//List<String> actList = new ArrayList<>();		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
