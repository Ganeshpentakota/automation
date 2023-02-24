package screenshot;
import java.io.File;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class chromeDriver {
	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganes\\OneDrive\\Desktop\\java1\\src\\drivers\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://google.com/");
		  List<WebElement> nlinks = driver.findElements(By.tagName("a"));
		  System.out.println(nlinks.size());
		  for(int i=0;i< nlinks.size();i++) {
			  
			  if(nlinks.get(i).isDisplayed()) {
				  nlinks.get(i).click();
				  if(driver.getCurrentUrl()== "https://google.com/") {continue;}
				  System.out.println(driver.getCurrentUrl());
				  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  Files.copy(src,new File("C:\\Users\\ganes\\OneDrive\\Desktop\\screenshot\\"+i+".png"));
				  driver.navigate().to("https://google.com/");
				  nlinks = driver.findElements(By.tagName("a"));
			  }else {System.out.println("@  "+i);}
			
			
		  }
		 
		 driver.close();
	 }

}
