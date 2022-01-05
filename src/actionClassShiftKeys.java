import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassShiftKeys {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		WebElement click = driver.findElement(By.id("nav-hamburger-menu"));
		
		click.click();
	
		Thread.sleep(1000);
				WebElement open = driver.findElement(By.xpath("//div[@id='hmenu-content']//following::ul//li[2]//a[text()='Best Sellers']"));
				//open.click();
				
		Actions action = new Actions(driver);// is working for like holding shift keys
		action.moveToElement(open)
		.keyDown(open, Keys.SHIFT)
		.click()
		.keyUp(open, Keys.SHIFT)
		.build().perform();
		
		
		
//		action.moveToElement(searchBar)
//		.keyDown(searchBar, Keys.SHIFT)
//		.sendKeys(searchBar, "selenuim")
//		.keyUp(searchBar, Keys.SHIFT)
//		.build().perform();
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
