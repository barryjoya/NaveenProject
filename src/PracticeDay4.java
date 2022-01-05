import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class PracticeDay4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		   HtmlUnitDriver driver = new HtmlUnitDriver();
		   
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.xpath("//span[text()='My Account']"));
		
		String actual = element.getText();
	    String str = "My Account";

		check(actual,str);
		element.click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebElement registerAccount = driver.findElement(By.xpath("//div[@id='content']//child::h1[text()='Register Account']"));
		String account = registerAccount.getText();
		String verify = "Register Account";
		check(account,verify);
		WebElement loginRegist = driver.findElement(By.xpath("//div[@id='content']//child::p[text()='If you already have an account with us, please login at the']"));
		String login = loginRegist.getText();
		String in = "If you already have an account with us, please login at the";
		check(login,in);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
				firstName.sendKeys("john");
				
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nachway");;
				
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("john@yahoo.com");;
				
				driver.findElement(By.id("input-telephone")).sendKeys("1234567");
				
				driver.findElement(By.id("input-password")).sendKeys("Helooworld");
				
				driver.findElement(By.id("input-confirm")).sendKeys("Helooworld");
				
				
				
				
				
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
		
//		WebElement web = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		
//	
//		String tagName = web.getTagName();
//		String textName = web.getText();
//		
//		driver.findElement(By.xpath("//"+tagName+"[text()='"+textName+"']")).click();
		
		//Point p = web.getTagName();// becuase this is for selenuim 3
		//System.out.println(p);
		
		//Dimension dim= web.getText();// becuase this is for selenuim 3
	   
//		Rectangle rect = web.getRect();
//		System.out.println(rect.height);

	}

	public static void check(String actualText, String expectedText) {
		if(actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText+ " = " +expectedText+ " Passed " );
		}else {
			System.out.println(actualText+ " != " +expectedText+ " Failed ");
		}
	}
}
