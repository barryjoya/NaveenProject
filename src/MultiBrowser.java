import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver ;
		String browser ="chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.ebay.com/");
		//driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 // single Action on perform(); method works
		Thread.sleep(6000);
		driver.close();
		
		
		

	}

}
