package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		     wait in selenium WebDriver:
	          1. Dynamic wait = soft wait
	              a. Implicit wait
	                   i.implicit wait direct the selenium WebDriver to wait for a certain amount of time
	                     before throwing an exception
	                  ii.because implicit wait is a smart wait, if the element is present or intractable
	                     before 20 second, it will perform the command and move on to the second command.
	              b. Explicit wait
	                   we can define a wait time for each element separately.
	                   For Ex : We have a text that we want to get from the website, and the rest 
	                   of the Website is loading in 1 second and the text will load in 3 second
	                   explicit wait is specifically useful for AJAX elements since they are updated on a separate
	                   request.
	                   
	              c. Fluent wait = smart wait
	                   i. because we can also command how many attempt every other seconds it 
	                      should make to check and see if the element available
	           
	          2. static wait = hard wait
	              a.Thread sleep(millisecond);
	          3. PageLoadTimeOut
	             a. pageLoadTimeOut will wait for the browser to load all elements on the page before
	                throwing an exception.
		 */
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		
		//Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(text));
		
		//Fluent wait
		FluentWait<WebDriver> flu = new FluentWait<WebDriver>(driver);
		flu.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2));
		//flu.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='umbra blue ']")));
		flu.until(ExpectedConditions.visibilityOf(text));
		
		System.out.println(text.getText());
		
		
	}

}
