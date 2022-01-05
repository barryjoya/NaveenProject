package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook pro 2021");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("_dGV0c_image_1pfbQ")).click();
		 WebElement dri = driver.findElement(By.tagName("span"));
		 System.out.println(dri.getText());
		
		/*
		  a type of dynamic wait
		  dynamic waits are not hard wait, that means if we don't need the wait time, then the system
		  will ignore the remaining wait if the action can be performed
		 */
		//Thread.sleep(10000);
		//pageloadtimeout
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		/*
		Implicitly wait = is a global wait and it applies to all of the elements in the web page
		that we want interact with
		*/
		//Implicitly wait.
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		/*
         driver.findElement(By.id("email")).sendKeys("seyarjoyandah");
         driver.findElement(By.name("pass")).sendKeys("123");
         driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).click();
         */
		
		/*
		 static wait/ hard wait Thread.sleep();
		 we dont use static wait in automation too often, use it only if we want to 
		 debug our code
		 */
		/*
			Thread.sleep(3000);
		
	    driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        */
         //WebElement text = driver.findElement(By.tagName("h2"));
         //System.out.println(text.getText());
        // driver.findElement(By.id("email")).sendKeys(text.getText());
	}

}
