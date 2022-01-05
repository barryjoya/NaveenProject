import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		//driver.get("https://shop.demoqa.com/");
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1))// accepting to see if the element is available
				.withMessage("the message is not correct");
		WebElement element = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbraa blue ']")));
			//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
			//WebElement ele =	
		wait.until(ExpectedConditions.visibilityOf(element));
		
		System.out.println(element.getText());
		
		driver.close();

	}

}
