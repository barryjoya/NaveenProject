package MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationSizeRecMethods {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement els = driver.findElement(By.xpath("//a[text()='Create new account']"));
		System.out.println(els.getAttribute("id"));
		
		//Selenium 3
		/*
		 in selenium 3 we had two classes 
		 1. point 
		 2. Dimension
		 
		   getLocation();
		   getSize();
		 */
		
		/*//1. class point will give us the location of an element
		 Point p = els.getLocation();
		 System.out.println(p);
		 */
		/* //2. Dimension will give us the size of an element
		 Dimension d = els.getSize();
		 System.out.println(d);
		 */
		 /*
		  getRect();
		  In selenium 4
		  */
		 Rectangle rect = els.getRect();
		 System.out.println("Height: "+rect.height);
		 System.out.println("Width: "+rect.width);
		 System.out.println("X: "+rect.getX());
		 System.out.println("Y: "+rect.getY());
		 
		 
		

	}

}
