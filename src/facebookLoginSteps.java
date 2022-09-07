import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class facebookLoginSteps {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//div[@class='_6ltg']//a[@role='button']")).click();
		
		WebElement name = driver.findElement(By.name("firstname"));
		
		name.sendKeys("hawa");
		
		WebElement lName =driver.findElement(By.name("lastname"));
		lName.sendKeys("jam");
		
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		
		email.sendKeys("hawajam@yahoo.com");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		
		password.sendKeys("123456789");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
		
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select monthsel = new Select(month);
		
		monthsel.selectByVisibleText("May");
	
		System.out.println(monthsel.toString());
		
		
	   // List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']//child::option"));
		
		//WebElement month = driver.findElement(By.id("month"));
//		for (int i = 0; i < month.size(); i++) {
//		    System.out.println(i+" = "+month.get(6).getText());
//		    if(i == 4) {
//		    	month.get(i).click();
//		    }
//			if(month.get(i).getText().equalsIgnoreCase("Jun")) {
//				month.get(i).click();
//			}
			
//		}
//	    for(WebElement i:month) {
//	    	if(i.getText().equalsIgnoreCase("Oct"))
//	    		i.click();
//	    	System.out.println(i.getText());
//	    }
//		Select sel = new Select(month);
//		sel.selectByValue("5");
//	
//		System.out.println(month.getText());
//		
//
	    
	   List< WebElement> day = driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
	   
	   for(int i =0; i<day.size(); i++) {
		   if(i==5)
			   day.get(i).click();
		   System.out.println(i + " = " +day.get(i).getText());
	   }
	   
	   
	   
	   WebElement day1 = driver.findElement(By.id("day"));
	   
	   Select sel1 = new Select(day1);
	    
	   // sel1.selectByValue("5");
	    System.out.println(day1.getText());
	    
	    
	    
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select year1 = new Select(year);
	    year1.selectByValue("2018");
	    System.out.println(year1);
	
	    
	    
	    List<WebElement> sex = driver.findElements(By.xpath("//div[@class='mtm _5wa2 _5dbb']//span//span"));
	    
	    for (WebElement element : sex) {
			if(element.getText().equalsIgnoreCase("Custom")) {
			element.click();
			
			}
			System.out.println(element.getText());
		}
	    
	    
	    String she = "";
	  List<WebElement> text = driver.findElements(By.xpath("//select[@name='preferred_pronoun']//option"));
	  for(WebElement i: text) {
		 // System.out.println(i.getText());
	  }
	  for(int i = 1; i<text.size(); i++) {
		  if(text.get(i).getText().contains("He")){
			  she += text.get(i).getText();
		  }
	  }
	    WebElement selDrop = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	 //   System.out.println(she);
	    Select sel = new Select(selDrop);
	//    sel.selectByIndex(1);
	    sel.selectByVisibleText(she);
	 //   sel.selectByValue("6");
	   
	    
	    
//	    for(int i =0; i<sex.size();i++) {
//	    	if(sex.get(i).getText().contains("Male"));
//	    	sex.get(i).click();
//	    	System.out.println(sex.get(i).getText());
////	    	sex.get(i).getText().equalsIgnoreCase("Custom");
////	    	sex.get(i).click();
//	    	break;
//	    
//	    }
	    
	   
	    
	    
	}
	
	
	
		
	public static void takeScreenShot() throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(".\\facebook.png"));
		
		
	}
	
	public static void highLight(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollTo(0, document.body.scrollHight)"+element);
			
		}
		
	
}
