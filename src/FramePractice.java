import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub   //iframe[@id='iframeResult']

		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']"));
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
		login.click();
		//driver.findElement(By.id("navbtn_menu")).click();
		
	//	driver.findElement(By.id("search2")).sendKeys("Hello");
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
