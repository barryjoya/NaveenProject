package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class SeleniumFirstDay {

	public static void main(String[] args) {
		
		
		//how to launch WebDriver;
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\baria\\eclipse-workspace\\Selenuim Phoenix\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//we need to create reference to WebDriver.
		//ChromeDriver driver = new ChromeDriver();
		
		//to make sure use reference of WebDriver and then initialize it with our browser that we want 
		//to launch our WebSite.
		//WebDriver is an interface.
		WebDriver driver = new ChromeDriver();
	//	ChromeDriver driver1 = new ChromeDriver();
		/*
		What does WebDriver driver = new ChromeDriver(); means? 
	    We are creating a ChromeDriver instance and storing it in a variable called driver,which is a type
		WebDriver interface.
		*/
		
		//we can use .get(); method to provide the URL for web browser and launch our browser.
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Title:"+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl() );
		System.out.println("Page source code: "+driver.getPageSource());
		
		//.Close(); method will close the current browser opened by selenium.
		//driver.close();
		//.quit(); method will close all of the browser opened by selenium
		driver.quit();
		
		
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();;
		
 		
		
		
	}

}
