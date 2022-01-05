import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClassPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		///HtmlUnitDriver driver = new HtmlUnitDriver();
		
		//driver.get("https://shop.demoqa.com/");
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		
	    WebElement element = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//child::select"));
		wait.until(ExpectedConditions.visibilityOf(element));
	    element.click();
		System.out.println(element.getText());
		
		dropDownList(element, "Finland");
//		Select select = new Select(element);
//		select.selectByVisibleText("Finland");
		
		element.click();
		//System.out.println(select);
		
		driver.close();
		
		Thread.sleep(6000);
		List<WebElement> els = driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//select//option"));
		//System.out.println(els.get(1));
		System.out.println(els.get(2).getText());
		String contry = "";
		
		for(int i =0; i<els.size(); i++) {
			contry=els.get(i).getText();
			if(els.get(i).getText() == "Yemen") {
              break;
			}
			System.out.println(contry);
		}
		
		
		
		
	
		
		String dob = "10-Mar-1998";
		String arr [] = dob.split("-");
//		WebElement month = driver.findElement(By.id("month"));
		
//		Select select = new Select(month);
//		select.selectByVisibleText("Feb");
//		System.out.println(month.getText());
//		
//		WebElement day = driver.findElement(By.id("day"));
		
//		Select select1 = new Select(day);
//		select1.selectByVisibleText("21");
//		System.out.println(day.getText());
//		
//		WebElement year = driver.findElement(By.id("year"));
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1982");
//		System.out.println(year.getText());
//		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

		
		
//		dropDownList(month, "Mar");
//		dropDownList(day, "10");
//		dropDownList(year, "2000");
		

	}


	public static void dropDownList(WebElement element, String str) {
		
		Select select = new Select(element);
		select.selectByVisibleText(str);
	}
}
