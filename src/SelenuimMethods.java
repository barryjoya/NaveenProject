import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		System.out.println("Title "+driver.getTitle());
		System.out.println("URL "+driver.getCurrentUrl());
		System.out.println("Page "+driver.getPageSource());
//		Thread.sleep(3000);
//		driver.navigate().to("https://chromedriver.storage.googleapis.com/index.html?path=96.0.4664.45/");
//		Thread.sleep(4000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
		
	driver.findElement(By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[3]/div/div[3]/div[1]/div/a")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	driver.close();
//		driver.quit();

	}

}
