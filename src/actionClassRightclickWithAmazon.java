import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;

public class actionClassRightclickWithAmazon {

	public static Random rand = new Random();
	public static Scanner scan = new Scanner(System.in);
	static String curname;
	static String curlast;
	static String curemail;
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
		rand();
		
	
		System.out.println("do you wanna change your first and last name??\nYes or No");
		
		String ans = scan.next();
		while(!ans.equalsIgnoreCase("no")) {
			
			rand();
			
			ans = scan.next();
		}
		
		
		
		String pass = "1234556";
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.get("https://www.amazon.com/ref=nav_logo");
		//driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*WebElement basic = driver.findElement(By.linkText("Amazon Basics"));
		
		Select sel = new Select(basic);
		
		sel.selectByValue("yes");
		
		sel.selectByVisibleText("Yes");
		
		Actions action = new Actions(driver);
		
		
		
		//We Have two Actions below 
		//action.moveToElement(career).perform(); // single Action on perform(); method works
		//action.click(career).perform();
		action.contextClick(basic).perform();
		//action.moveToElement(basic).click(basic).build().perform();
		srollUp();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> itr = handle.iterator();
		
		String parent = itr.next();
		String child = itr.next();
		
		
		
		driver.switchTo().window(child);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys(curname);
		driver.findElement(By.id("lastName")).sendKeys(curlast);
		driver.findElement(By.id("email")).sendKeys(curemail);
		driver.findElement(By.id("password")).sendKeys(pass);
		
		Thread.sleep(10000);
		
		
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("done");
		
		
			Thread.sleep(2000);
		
		driver.quit();
		

	}
	
	public static void srollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	public static void rand() {
		
		
	
		String[] name = {"seyar","morid","baryalai","toryalai","wali","arif","hena"};
		String[] last = {"joyandah","Hashimi","ahmadi","ghousy"};
		
		int name1 = rand.nextInt(name.length);
		int last2 = rand.nextInt(last.length);
		
		System.out.println(curname = name[name1]);
		System.out.println(curlast = last[last2]);
		System.out.println(curemail = curname+""+curlast+"@gmail.com");
	}

}
