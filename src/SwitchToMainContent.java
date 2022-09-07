import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SwitchToMainContent {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
        WebElement frame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame);
        
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofSeconds(1));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Try it']")));
        WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryIt.click();
        
        //to accept
//      driver.switchTo().alert().accept();
        //to dismiss
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='runbtn']")));
        WebElement text = driver.findElement(By.xpath("//button[@id='runbtn']"));
        System.out.println(text.getText());
        Thread.sleep(6000);
        driver.close();
		
		

	}

}
