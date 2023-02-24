package url;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bing {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\OneDrive\\Desktop\\java1\\src\\drivers\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.bing.com/");
	  List<WebElement> nlinks = driver.findElements(By.tagName("a"));
	  System.out.println(nlinks.size());
	  for(int i=0;i< nlinks.size();i++) {
		  
		 try { if(nlinks.get(i).isDisplayed()) {
			  nlinks.get(i).click();
			  if(driver.getCurrentUrl()== "https://www.bing.com/") {
				  continue;
			  }
			  System.out.println(driver.getCurrentUrl());
			  driver.navigate().to("https://www.bing.com/");
			  nlinks = driver.findElements(By.tagName("a"));
		  }else {System.out.println("@  "+i);}}catch(ElementNotInteractableException e){
			  
		  }
	  }
	  driver.close();
 }
}
