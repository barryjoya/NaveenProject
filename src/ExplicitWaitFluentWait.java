import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitFluentWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://shop.demoqa.com/");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		
		
		WebDriverWait wa = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement as = driver.findElement(By.xpath(""));
		wa.until(ExpectedConditions.visibilityOf(as));
		as.getText();
		as.click();
		
		
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement from = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		wait.until(ExpectedConditions.visibilityOf(from));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(from));
		System.out.println(from.getText());
		from.click();
		
 //      	FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("the text is not visible")
//				.ignoring(NoSuchElementException.class);
//		
//		WebElement from = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
//		fWait.until(ExpectedConditions.visibilityOf(from));
//		System.out.println(from.getText());
		
		
		driver.close();

		
		
		WebDriverWait wat = new WebDriverWait(driver,Duration.ofSeconds(10));
		wat.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
	}
	

}
