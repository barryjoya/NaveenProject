import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class praticePractice {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("name", "Num");
		map.put("name1","seyar");
		map.replace("name1","seyar","morid");
		map.put("name1","baryalai");
		System.out.println(map);
		/*
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.aol.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, null);
		
	    List<WebElement> element = driver.findElements(By.xpath("//div[@class='desktop-user-navigation' and @id='td-app-aol-module-2']//span//following::span[contains(text(),'Login / Join')]"));
		System.out.println(element.get(1).getText());
		element.get(1).click();
		
		WebElement login = driver.findElement(By.id("login-username"));
		
		login.sendKeys("bariallai@aol.com");
		login.submit();
		
		*/

	}

}
