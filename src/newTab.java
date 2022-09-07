import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTab {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.stackoverflow.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
     	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
	
		
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> itr = wind.iterator();
		
		String parent = itr.next();
		String child = itr.next();
		
		driver.switchTo().window(child);
		driver.get("https://www.yahoo.com/");
		JavascriptExecutor jj = (JavascriptExecutor)driver;
		
		jj.executeScript("window.open()");
		
		driver.switchTo().window(child);
		driver.get("");
		
		driver.switchTo().window(parent);
		
		driver.get("https://www.stackoverflow.com");
	
		
	//	ArrayList<String> arr = new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(arr.get(1));
		//driver.get("https://www.yahoo.com/");
		
		driver.navigate().back();
		
		//driver.navigate().to("https://www.yahoo.com/");
		
		//driver.navigate().back();
		
	
		
		List<WebElement> e = driver.findElements(By.xpath("//span[text()='Login / Join']"));
		
		e.get(0).click();
		System.out.println(e.get(2).getText());
		
		
		
		
		
		
		
		
	}
	
	
}
