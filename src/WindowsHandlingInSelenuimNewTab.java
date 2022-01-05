import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingInSelenuimNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebElement openNewWindow = driver.findElement(By.id("newTabBtn"));
		openNewWindow.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		WebElement text = driver.findElement(By.xpath("//h3[text()='Button2']"));
		System.out.println(text.getText());
		
		System.out.println("This is Parent: " + parentWindow);
		System.out.println("This is Child: " + childWindow);
		
		
		Thread.sleep(6000);
		driver.quit();
		

	}

}
