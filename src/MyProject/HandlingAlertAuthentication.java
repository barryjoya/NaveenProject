package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertAuthentication {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
         
		
		
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://order.ikea.com/us/en/appointment/kitchen");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
		System.out.println(element.getAttribute("button#onetrust-accept-btn-handler"));
		

		driver.switchTo().alert().accept();
		
//		WebElement frame = driver.findElement(By.id("iframeResult"));
//		driver.switchTo().frame(frame);
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
