package webdriverManageer;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();        
        WebDriver driver = new ChromeDriver();
       
       
       driver.get("https://courses.letskodeit.com/practice");
       driver.manage().window().maximize();
       driver.findElement(By.id("benzradio")).click();
          Select drpCar=new Select(driver.findElement(By.id("carselect")));
          drpCar.selectByVisibleText("Benz");
          
      	
			  String originalWindow = driver.getWindowHandle();
			  System.out.println(originalWindow); assert driver.getWindowHandles().size()
			  == 1;
			  driver.findElement(By.id("openwindow")).click(); 
			
			  
			  for (String 			  
			  windowHandle : driver.getWindowHandles())
			  {
			  if(!originalWindow.contentEquals(windowHandle)) 
			  
			  {
			  driver.switchTo().window(windowHandle);
			  driver.findElement(By.linkText("HOME")).click();
			  driver.findElement(By.linkText("ALL COURSES")).click();
			  driver.switchTo().window(originalWindow);
			  
			 
			  
			  
			  
			  } 
			  
			  }
			 
      
 
		
          
 
    


	}

}
