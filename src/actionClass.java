import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static WebDriver driver;
	public static String name;
	public static String lName;
	public static String email;
	public static String telephone;
	public static String pass;
	public static String confirm;
	public static String sub;
	public static String con;
	
	public static Scanner scan;
	public static String shot;


	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		confirm();
		
		while(!con.equalsIgnoreCase("yes")) {
			confirm();
		}
	
	
		System.out.println("do you want to take Screen shot? ");
		shot = scan.next();
		
	
	
		
		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		
		//driver.get("https://www.browserstack.com/");
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//takeScreen();
		//scroll();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(telephone);;
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);//confirm
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys(confirm);
		
		if(sub.equalsIgnoreCase("yes")) {
			driver.findElement(By.xpath("//label[@class='radio-inline']//child::input[@value='1']")).click();
		}else if(sub.equalsIgnoreCase("no")) {
			driver.findElement(By.xpath("//label[@class='radio-inline']//child::input[@value='0']")).click();
		}
		
		
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();;
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		if(shot.equalsIgnoreCase("yes")) {
				takeScreen();
		}
	
		/*
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='radio-inline']//child::input[@value='1']")).click();;
		
		scrollup();

		Thread.sleep(3000);
		
		
		
		
		
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert2");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.navigate().to("https://www.amazon.com/ref=nav_logo");
		
		WebElement cick = driver.findElement(By.xpath("//a[@aria-label='Open Menu']"));
		Actions cl = new Actions(driver);
		cl.moveToElement(cick).contextClick().perform();
		
		WebElement seller = driver.findElement(By.linkText("Best Sellers"));
		
		cl.keyDown(seller,Keys.SHIFT).perform();
		//cl.click().perform();
		*/
	}
	
	public static void takeScreen() throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		
	
		File file = shot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File(".\\screena.png"));
	}

	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
	}
	
	public static void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-200)");
		
	}
	
	public static void confirm() {

	   scan	=new Scanner(System.in);
		
		System.out.println("regsitration");
		System.out.print("Firstname: ");

	     name = scan.next();
		System.out.print("Lastname: ");
		 lName = scan.next();
		System.out.print("email: ");
		 email = scan.next();
		System.out.print("phone: ");
		 telephone = scan.next();
		System.out.print("password: ");
		 pass = scan.next();
		System.out.print("confirm: ");
		 confirm = scan.next();
		while(!pass.equals(confirm)) {
			System.out.println("password doesn't match");
			System.out.print("confirm: ");
			confirm = scan.next();
			if(pass.equals(confirm)) {
				System.out.println("password matched");
			}
		}
		System.out.println("subsribe!\nYes or No");
		 sub= scan.next();
		
		 System.out.println("do you want to Confirm? ");
		 con = scan.next();
	}
	
}
