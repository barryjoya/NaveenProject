import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Headless {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

            HtmlUnitDriver driver = new HtmlUnitDriver();

		
		
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		//WebElement me = wait.until(isTrue)
		
	
		
     	WebElement frame = driver.findElement(By.id("iframeResult"));
 		driver.switchTo().frame(frame);
 		//Wait<WebDriver> ele = new FluintWait
 		
//		
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		
//		driver.switchTo().alert().sendKeys("baryalai");
//		System.out.println(driver.switchTo().alert());
//		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.close();

	}

}
