package MyProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkTextAndPartialText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//HtmlUnitDriver driver = new HtmlUnitDriver();
		
		//driver.get("https://www.amazon.com/");
		
	//	Thread.sleep(1000);
		//  LinkText and partialText
	    //driver.findElement(By.linkText("Best Sellers")).click();
		// driver.findElement(By.partialLinkText("Best")).click();
		
		 /*
		  Xpath: Start-With
		  //input[@name='value']
		  //input[starts-with(@name='val')];
		   
		   Sometime part of the value many change. for example first time when we launch the browser
		   the value for attribute name is email and the second time the attribute for
		    name is email-or-phone-number
		  */
		 
		
		 /*
		  We can alos use Css selector to locate element on browser
		  and also css select is a bit faster than xpath
		  but, there are some cons with it comes to css selector
		  
		       1. When we write css selector we have less options when we are traversing through 
		          elements in the DOM with xpath we can go from child to parent and from parent 
		          to child but will css selector we can only go from parent to child
		       2. The css selector was more useful for internet explorer browser , but now since
		          Internet Explorer is deprected and not used or updated anymore , better to use
		          xpath and other method to locate elements
		       3. Then why should we know about css selector, mainly for interview purposes and
		          also just because xpath has more advantages doesn't mean we will never use css
		          selector. To locate some elements , we have use only css selecyor to locate the element
		          
		          with ID
		          xpath = //input[@id='email]
		          
		          css selector = input[id='email'] also input#email
		          
		          with class
		          
		          css selector = input[class = 'hm-icon-label] also input.hm-icon-label
		          
		          
		          
		          (^)=  Signify's the prefix of the text 
		                Original = input[name='firstname']
		                with prefix = input[name^=first]
		                
		          ($)=  Signify's the suffix of the text 
		                Original = input[name='firstname']
		                with prefix = input[name$=name]
		                
		          (*)=  Signify's the sub-string
		                Original = input[name='firstname']
		                with prefix = input[name*=rstna]
		          		  */
		// driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();
		 //driver.findElement(By.cssSelector("a[class='nav-a  ']")).click();
		// driver.findElement(By.cssSelector("a.nav-a  ")).click();
		
		 
		 
		   /*
		     Handling CheckBoxs using selenium 
		     
		     
		        when we handle checkboxes using selenium before clicking on the check box , we need to check
		        the state of the check box. with check boxes we can check more than one check boxes
		        
		        
		         and also to do that , we use the methods that are available in selenium and the are:
		         
		        1.isDisplayed();
		        2.isEnabld();
		        3.isSelected();
		     
		    */
		/*
		     driver.get("https://www.facebook.com/");
		     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		     Thread.sleep(3000);
		     WebElement els =  driver.findElement(By.cssSelector("input[value='1']"));
		     
		     boolean isdiplayed = els.isDisplayed();
		     
		     boolean isenable = els.isEnabled();
		     
		     boolean isselected = els.isSelected();
		     
		     System.out.println(isdiplayed);
		     System.out.println(isenable);
		     System.out.println(isselected);
		     
		     els.click();
             boolean isdiplayed1 = els.isDisplayed();
		     
		     boolean isenable1 = els.isEnabled();
		     
		     boolean isselected1 = els.isSelected();
		     
		     System.out.println(isdiplayed1);
		     System.out.println(isenable1);
		     System.out.println(isselected1);
		*/
		
		
		//Select method
	    
		 driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    // Thread.sleep(1000);
		WebElement Months = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select select = new Select(Months);
	//	Thread.sleep(1000);
		System.out.println(Months.getText());
		
//		for(int i =0; i<40; i++) {
//			System.out.print(select.selectByIndex(i));
//		}
		//Thread.sleep(3000);
		select.selectByIndex(1);
	//	select.selectByValue("Jun");
	//	select.selectByVisibleText("");

		
/*
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	     
	     Thread.sleep(3000);
	     
	     List<WebElement> el = driver.findElements(By.xpath("//select[@name='birthday_month']//child::option"));
	    System.err.println();
	     List<String> els = new ArrayList<>();
	     
	     
         for(int i =0; i<el.size(); i++) {
        	 
        	 els.add(el.get(i).getText());
         }
	     System.out.println(els);
	
	    WebElement we =  driver.findElement(By.xpath("//a[text()='Create new account']"));
	     Point p = we.getLocation();
	     System.out.println(p);
	     Dimension d = we.getSize();
	     System.out.println(d);
	     */
	     
	}

}
