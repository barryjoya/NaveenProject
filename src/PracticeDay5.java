import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDay5 {
	
	public static WebDriver driver;
	
     public static void main(String[] args) throws InterruptedException {
		
    	 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    	 
    	 driver = new ChromeDriver();
    	 
    	 driver.get("http://tek-school.com/retail/");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 
    	// driver.findElement(By.linkText("Laptops & Notebooks")).click();
    	 
    	 driver.findElement(By.partialLinkText("Laptops")).click();;
    	 Thread.sleep(1000);
    	 
    	 driver.findElement(By.xpath("//a[text()='Macs (0)']")).click();
    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Continue']"))).click();
    	 
    	 
    	 System.out.println(driver.getCurrentUrl());
    	WebElement element = driver.findElement(By.tagName("href"));
    	System.out.println( element.getText());
    	//driver.findElement(By.xpath("top-links"));
    	 
    	 
    	 
    	 driver.close();
	}
     
   public static void takeScreenshot(String string) throws IOException {
	   TakesScreenshot shot = (TakesScreenshot)driver;
	   File file = shot.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file, new File(""));
   }
     
     
}
