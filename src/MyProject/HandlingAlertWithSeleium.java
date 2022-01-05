package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertWithSeleium {

	public static void main(String[] args) throws InterruptedException {
	
		
		 /*
	      How to handle frame in selenium?
	      
	            if we want to interact with an element that is inside a frame, before any action we have to first
	      go to that frame and then interact with the element. because the element we want to click on or get
	      text from is inside a frame and the frame is inside the web page.
	      
	      
	      
	      how to handle alerts
	      
	      Alerts in Selenium are JavaScript pop up alert that not part of the DOM. that means we can not
	      look for any locator to interact with the alert inside the DOM. They are separate entity from DOM.
	      
	      1.  Alert with an OK button
	     
	      To accept
	      driver.switchTo().alert().accept();
	      To dismiss
	      driver.switchTo().alert().dismiss();
	      
	      2.  Alert that requires a text
	      
	      driver.switchTo().alert().sendKeys("seyar joyandah");
	       To accept
	      driver.switchTo().alert().accept();
	      To dismiss
	      driver.switchTo().alert().dismiss();
	      
	      3.  Alert with YES or NO buttons
	            To accept
	      driver.switchTo().alert().accept();
	      To dismiss
	      driver.switchTo().alert().dismiss();
	      
	      4.Alert that requires authentication
	        this one will handled differently from the above 3 examples.
	        how to handle
	         we can send/include the authentication(UserName and password) in URL
	         
	          Original URL = http://the-internet.herokuapp.com/basic_auth
	          
	          http://admin:admin@the-internet.herokuapp.com/basic_auth
	          
	          
	      */
		
		
	   System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   WebElement el = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
	   //Using selenium Pre-Built functions, switch to that frame
	   driver.switchTo().frame(el);
	   
	   driver.findElement(By.xpath("//button[text()='Try it']")).click();
	   
	   Thread.sleep(2000);
	   
	   //To text
	  // driver.switchTo().alert().sendKeys("seyar joyandah");
	   Thread.sleep(1000);
	   //To accept
	   //driver.switchTo().alert().accept();
	   //To dismiss
	   driver.switchTo().alert().dismiss();
		

	}

}
