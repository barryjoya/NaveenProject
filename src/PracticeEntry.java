import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEntry {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		WebElement first = driver.findElement(By.id("input-firstname"));
		first.sendKeys("Baryalai");
		WebElement last = driver.findElement(By.id("input-lastname"));
		last.sendKeys("joyan");
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("aol@aol.com");
		
		WebElement tel = driver.findElement(By.id("input-telephone"));
		tel.sendKeys("57654384758");
		
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys("password");
		
		WebElement confPass = driver.findElement(By.id("input-confirm"));
		confPass.sendKeys("password");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		radio.get(1).click();
		
		WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agree.click();
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		//submit.click();
		
		TakesScreenshot shot = (TakesScreenshot)driver;
		
		File file = shot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File(".\\file.png"));
		
		driver.close();
		
	}

}
