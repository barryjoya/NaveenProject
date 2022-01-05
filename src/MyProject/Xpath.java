package MyProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		
		Thread.sleep(3000);
		
		//Parent to child
	     driver.findElement(By.xpath("//select[@name='birthday_month']//child::option[@value='2']")).click();
	     List<WebElement> el = driver.findElements(By.xpath("//select[@name='birthday_month']//child::option"));
	     /*
	       Parent = previous,but it has to be the parent of current node
	       
	       child = next, but it has to be the child of current node
	       
	       Following = next, but it doesn't have to be the child of current node
	       
	       following-sibling = next, but also mean both current and the next node have to have to same parent
	       
	       preceding = previous node
	       
	       preceding-sibling = previous sibling node
	      */
	     
	     String str ="";
	     
	     System.out.print("Months: ");
	     for(int i =0; i<el.size(); i++) {
	    	 str=el.get(i).getText();
	    	 System.out.print(str+"  _  ");
	     }
	     
	     WebElement els = driver.findElement(By.xpath("//button[@value='1']"));
	     //For getAttribute method we may get null or blank.
	    // System.out.println(els.getAttribute("data-testid"));
	     //For getDomAtrribute method we may get true or null.
	     System.out.println("GetDomAttribute name: "+els.getDomAttribute("id"));
	     //For GetDomProperty method it will give the property of the element
	     System.out.println("GetDomProperty name:"+els.getDomProperty("name"));
	     
	     //GetTagName will get the TagName for an attribute in the DOM
	     System.out.println("GetTagName: "+els.getTagName());
	     
	    
	     
	}

}
