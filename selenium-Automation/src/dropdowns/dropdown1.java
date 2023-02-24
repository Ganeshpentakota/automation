package dropdowns;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropdown1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\OneDrive\\Desktop\\java1\\src\\drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.findElement(By.tagName("select")).sendKeys("India");
    
	   
	}
}
