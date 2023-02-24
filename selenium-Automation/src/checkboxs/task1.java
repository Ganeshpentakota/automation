package checkboxs;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1{

public static void main (String[]args) throws InterruptedException{

System.setProperty("webdriver.chrome.driver",  "C:\\Users\\ganes\\OneDrive\\Desktop\\java1\\src\\drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
driver.manage().window().maximize();
Thread.sleep(3000);  
  List<WebElement> ncheckboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
  for(int i=0;i<ncheckboxs.size();i++){
    String nvalus = ncheckboxs.get(i).getAttribute("value");
    if(nvalus.equals("blue")){
    ncheckboxs.get(i).click();
    }
    if(ncheckboxs.get(i).isDisplayed() && ncheckboxs.get(i).isSelected()){
        System.out.println(nvalus + " is activated");
    }
    else{
        System.out.println(nvalus + "  is not activated");

    }
  }
  Thread.sleep(2000);
  driver.close();
}
    
}



