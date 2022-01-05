import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingInPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/browser-windows");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebElement openNewWindow = driver.findElement(By.cssSelector("button#newWindowBtn"));
		openNewWindow.click();
		
		
		
		Set<String> allWindow = driver.getWindowHandles();
		
		Iterator <String> itr = allWindow.iterator();
		
		String parent = itr.next();
		String child = itr.next();
	
		
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("baryali");
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("hey");
		
		
		

		
		
		
		
		
	  
		
	    Thread.sleep(1000);
		WebElement newTab = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		newTab.click();
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']"))
		.click();
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
