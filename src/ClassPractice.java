import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassPractice {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		
//				WebDriver driver = new ChromeDriver();
//				driver.get("https://www.facebook.com/");
//				//driver.findElement(By.xpath(""));

		//1. we have to make sure we have chrome browser installed on our computer
				//2. we have to make sure we downlaoded and added the chromedirver to our project
				//3. we have to write the code to launch "https://www.facebook.com/" on chrome
				
				
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ardcs\\eclipse-workspace\\SeleniumLecture\\drivers\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				//We need to create reference to WebDriver,
				//
//				ChromeDriver driver = new ChromeDriver();
//				driver.launchApp("1234");
				WebDriver driver = new ChromeDriver();
				driver.navigate().forward();
				//FirefoxDriver driver1 = new FirefoxDriver();
			
				//to make sure we use the reference of WebDriver and then initialize it with our browser that we want
				//to launch our website
//				WebDriver driver = new ChromeDriver();

				//we can use .get(); method to provide the url for the web browser and launch our browser
				driver.get("https://www.facebook.com/");
				
				
				
		}

}
	
