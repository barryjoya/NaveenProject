import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class actionClassWithAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		//driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='brandSlider']/div[1]/div/div/div/img)[50]")));
		element.click();
		
		WebElement career = driver.findElement(By.linkText("Careers"));
		
		Actions action = new Actions(driver);
		
		//We Have two Actions below 
		//action.moveToElement(career).perform(); // single Action on perform(); method works
		//action.click(career).perform();
		
		action.moveToElement(career).click(career).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();

	}

}
