import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingInSelenuim {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		WebElement open = driver.findElement(By.cssSelector("button#newWindowBtn"));
		open.click();
		
		Set<String> allWindow = driver.getWindowHandles();
		Iterator <String>itrate = allWindow.iterator();
		
		String parent = itrate.next();
		String child = itrate.next();
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("aa@yahoo.com");
			driver.switchTo().window(parent);
		driver.manage().window().maximize();
			Thread.sleep(3000);
		
		
	
		
		driver.findElement(By.id("name")).sendKeys("email@email.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(3000);
		System.out.println("This is parent: " + parent);
		System.out.println("This is Child: " + child);
		
		driver.quit();

	}

}
