

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDay3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bayrl@gmail.com");
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("234567");
		
		WebElement d = driver.findElement(By.xpath("//button[@name='login']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(d.getAttribute("name"));
		System.out.println(d.getAttribute("id"));
		System.out.println(d.getCssValue("background-color"));
		System.out.println(d.getDomAttribute("id"));
		System.out.println(d.getDomProperty(""));
		System.out.println(d.getTagName());
		WebElement click = driver.findElement(By.xpath("//a[text()='Create new account']"));
		click.click();
		System.out.println(click.getAttribute("Create new account"));
//		List<WebElement> list = driver.findElements(By.xpath("//select[@id='month']//child::option"));
//		
//		for (int i = 0; i <list.size(); i++) {
//			//String month = list.get(i).getText();
//			System.out.println(list.get(i).getText());
//		}
		WebElement month = driver.findElement(By.cssSelector("select#month"));
		Select select = new Select(month);
		select.selectByVisibleText("Jun");
		
	//	System.out.println(select.deselectByVisibleText(select));
	//	String mo = select.getClass();
		select.deselectAll();
		
		select.selectByIndex(1);
		
		List<WebElement> oselect = select.getOptions();
		System.out.println(oselect.size());
		WebElement ele = driver.findElement(By.xpath("//img[@class='_8idr img']"));
		ele.click();
		WebElement atr = driver.findElement(By.xpath("//button[@name='login']"));
		//atr.click();
		System.out.println(atr.getAttribute("name"));
		System.out.println(atr.getAttribute("class"));
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		
//             List<WebElement> element = driver.findElements(By.xpath(""));
//		
//		for (int i = 0; i < element.size(); i++) {
//		  
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		arr.add(6);
//		for (int i = 0; i < arr.size(); i++) {
//			if(arr.get(i)==4) {
//				System.out.println(arr.get(i));
//			}
//		}
//		

	}

}
