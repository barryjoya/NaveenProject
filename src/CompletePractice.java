import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CompletePractice {

	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		
		
		int start = 3;
		int end= 60;
		
		int k = start;
		int p = end;
		
//		for ( int i =start; i >=0; i--) {
//			//System.out.print(i+":");
//			for ( int j = end; j >= 0; j--) {
//				Thread.sleep(100);
//				System.out.println("-"+i+":"+j+"/"+start+":"+end);
//			}
//		}
//		while(start >=0) {
//			while(end >=0) {
//				Thread.sleep(100);
//				System.out.println("-"+start+":"+end+"/"+k+":"+p);
//				end--;
//			}
//			end = end + 60;
//			start--;
//		}

		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 //driver.get("https://www.facebook.com/");
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();;
		
		// Actions click = new Actions(driver);
		 
		
		 
		// driver.switchTo().alert().accept();
		 
		 WebElement date = driver.findElement(By.xpath("//label[@for='departure']"));
		 date.click();
		 scrollDownBy();
		 Thread.sleep(2000);
		 
		 WebElement nextMonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		 nextMonth.click();
		 // wait.until(ExpectedConditions.visibilityOf(nextMonth));
		 
		 Thread.sleep(1000);
		 
		 List<WebElement> month = driver.findElements(By.xpath("//div//div//div[@aria-disabled='false']"));
		 
		 scrollUpBy();
		 screenshot();
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
				 .pollingEvery(Duration.ofSeconds(2));
		 
				 for (WebElement element : month) {
					//System.out.println(element.getAttribute("aria-label"));
					//System.out.println(element.getDomProperty("aria-label"));
				
					if(element.getAttribute("aria-label").equalsIgnoreCase("Sun Feb 06 2022")) {
						System.out.println(element.getText());
						element.click();
					}
					 Thread.sleep(8000);
					 driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
				
				 

				 WebElement el = driver.findElement(By.id("newWindowBtn"));
		       
				 el.click();
		
				 
				 
				Set<String> str = driver.getWindowHandles();
				Iterator<String> itr = str.iterator();
				
				String parent =  itr.next();
				
				String child = itr.next();
				
				Thread.sleep(2000);
				driver.switchTo().window(child);
				WebElement childtext = driver.findElement(By.id("firstName"));
				driver.manage().window().maximize();
						childtext.sendKeys("baryali");;
						Thread.sleep(2000);
				driver.switchTo().window(parent);
				WebElement parenttext = driver.findElement(By.id("name"));
				driver.manage().window().maximize();
				parenttext.sendKeys("hello");
				 }
//		 driver.navigate().to("https://www.facebook.com/");
//		 driver.navigate().back();
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		/*
		List<WebElement> month = driver.findElements(By.xpath("//select[@name='birthday_month']//child::option"));
		
		for (WebElement element : month) {
			if(element.getText().equalsIgnoreCase("jan")) {
				element.click();
				
				System.out.println(element.getText());
			}
			
		}
		
		List<WebElement> day = driver.findElements(By.xpath("//select[@name='birthday_day']//child::option"));
		
		for (int i = 0; i < day.size();i++) {
			//System.out.println(day.get(i).getText());
			if(day.get(i).getText().equals("10")){
				day.get(i).click();
				System.out.println(day.get(i).getText());
			}
			
			
			
		}
		
		List<WebElement> year = driver.findElements(By.xpath("//select[@name='birthday_year']//child::option"));
		
		int c = 0;
		
		while(c<year.size()) {
			
			//System.out.println(year.get(c).getText());
			c++;
			if(year.get(c).getText().equalsIgnoreCase("2018")) {
				year.get(c).click();
			}
		}
		
		*/
	}
	
	public static void screenshot() throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File(".\\screen.png"));
	}


public static void scrollDownBy() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
}
public static void scrollUpBy() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-200)");
}
}
