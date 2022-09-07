import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.peraton.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//a[@class='mega-menu-link']//parent::li[contains(@id,'mega-menu-item-587')]"));
		
		
		Actions hover = new Actions(driver);
		
		hover.moveToElement(ele).perform();
		
		Thread.sleep(2000);
		WebElement her = driver.findElement(By.xpath("//a[text()='Our Heritage']//parent::li[@id='mega-menu-item-4665'] "));
		
		hover.moveToElement(her).click().build().perform();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.open()");
		
	    driver.navigate().to("http://tek-school.com/retail/index.php?route=common/home");
		
	

	}

}
