import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassSendText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		//driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		//searchBar.sendKeys("macbook pro");
		
		WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
				//submit.click(); 
		Actions action = new Actions(driver);
		action.sendKeys(searchBar, "best book").click(submit).build().perform(); // most of the time use sendKyes witouth action class
		
		// but sometimes we do need action class
		//action.click(searchBar);
		//action.moveToElement(searchBar).perform(); // single Action on perform(); method works
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();

	}

}
