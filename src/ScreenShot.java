import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		
		screenShot();

		driver.quit();
	}
	
	
	
	
	
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		
		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	

	
	public static void screenShot() throws IOException {
		
		TakesScreenshot shot = (TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\screen1.png"));
		FileUtils.copyFile(file, new File(".\\screen2.png"));
	}
	
	
	public static void TakeScreenShot(String name) throws IOException {
		TakesScreenshot shot = (TakesScreenshot)driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\screen1.png"));
	}


}
