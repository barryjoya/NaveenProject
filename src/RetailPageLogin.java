import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetailPageLogin {

	public static void main(String[] args)  {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Register']"));
		element.click();
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		element.isEnabled();
		
		WebElement regisAccount = driver.findElement(By.xpath("\"//h1[text()='Register Account']\""));
		String str = regisAccount.getText();
		String actual = "Register Account"; //div[@id='content']//h1
		checkToConfirm(str,actual);
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//System.out.println(element.getCssValue("New Customer"));
		


		 
		
		
		
		
		
	}
	

	
	public static void checkToConfirm(String actualText, String expectedText ) {
		if(actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText +"-" +expectedText+"passed");
		}else {
			System.out.println(actualText + "!="+expectedText+"fail");
		}
	}
	
	
	
}
