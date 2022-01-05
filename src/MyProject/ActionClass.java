package MyProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	
		/*
		 Action Class
		 
		 There are a lot methods in Action Class , but they are basically categorized in two main ones:
		 
		     1. KeyBoard Events
		          a.  SendKeys(): sends a series of keys to the element
		          b.  KeyUp(): Performs key release
		          c.  KeyDown(): performs KeyPress without release
		          
		     2. Mouse events
		          a.  DoubleClick(): performs double click on the element.
		          b.  ClickAndHold(): performs long click on the mouse without releasing it.
		          c.  DragAndDrop(): drags the element from one point and drops to another.
		          d.  MoveTOElement(): shifts the mouse pointer to the center of the element
		          e.  contextClick(); performs right-click on the mouse
		          
		     
		     note: when we are calling any of the Actions class methods, we have use the 
		     method perform(); after every Action. 
		     
		     but what if we are performing more one action at a time?
		     
		     in that case, first we have to call the method build(); and then perform();
		     and the way we call these two method is (build().perform();)
		     for single action, we only call the method perform(); and for composite actions we need to call both,
		     build() and perform.
		     
		     sometimes the methods we call for click or SenKeys may not work, that is when we need to get the
		     help of actions class or javaScriptExecutor
		     
		 */
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement el = driver.findElement(By.linkText("Fashion"));
		WebElement els = driver .findElement(By.xpath("//div[@id='gh-ac-box2']//child::input[@type='text']"));
		//els.sendKeys("hello");
		Actions action = new Actions(driver);
		
		//we can to this action in two ways
		
		//1
//		action.moveToElement(el).perform();
//		action.click(el).perform();
		//action.contextClick().perform();
		
		
		//2
//		action.moveToElement(el).click().build().perform();
		
		
		//We are pressing shift key
				action.keyDown(els, Keys.SHIFT)
				//send text
				.sendKeys(els,"mac")
				//we release the shift key
				.keyUp(els,Keys.SHIFT)
		        //build and perform, since we have composite action
				.build().perform();

	}

}
