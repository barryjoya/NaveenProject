import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameWork {

	@Test(dataProvider="multipleSet")
	public void login(String Username, String Password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(Username);
		
		driver.findElement(By.id("input-password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("My Account"));
		Thread.sleep(3000);
		
		driver.close();
	}
	
	@DataProvider(name ="multipleSet")
	public String [][] str (){
		
		String [][] data = new String [3][2];
		
		data[0][0] ="sdet@tekschool.us";
		data[0][1] ="sdet";
		
		data[1][0] ="consumer@tekschool.us";
		data[1][1] ="JBond";
		
		data[2][0] ="students@tekschool.us";
		data[2][1] ="TEST";
		
		return data;
		
	}
	
}
