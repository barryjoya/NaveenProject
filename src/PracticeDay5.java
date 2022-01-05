import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDay5 {
     public static void main(String[] args) {
		
    	 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    	 
    	 WebDriver driver = new ChromeDriver();
    	 
    	 driver.get("http://tek-school.com/retail/");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 
    	// driver.findElement(By.linkText("Laptops & Notebooks")).click();
    	 
    	 driver.findElement(By.partialLinkText("Laptops")).click();;
    	 
    	 System.out.println(driver.getCurrentUrl());
    	WebElement element = driver.findElement(By.tagName("href"));
    	System.out.println( element.getText());
    	//driver.findElement(By.xpath("top-links"));
    	 
    	 
    	 
    	 driver.close();
	}
}
