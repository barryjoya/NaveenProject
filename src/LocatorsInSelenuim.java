import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsInSelenuim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("email.com");
		driver.findElement(By.name("pass")).sendKeys("1234567");
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		WebElement text = driver.findElement(By.tagName("h2"));
		text.getText();
		System.out.println(text.getText());
		driver.close();
	//	Actions cl = (Actions) driver.findElement(By.className(""));
		
		
		//driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		
	}

}
