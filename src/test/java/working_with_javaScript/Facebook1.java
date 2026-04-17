package working_with_javaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.location='https://www.facebook.com/';");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));

		
		jse.executeScript("arguments[0].value='admin';",username);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value='admine@123';", password);
		Thread.sleep(3000);
		
		WebElement logn = driver.findElement(By.name("login"));
		logn.click();
		Thread.sleep(3000);
		
		
		
		driver.quit();
	}

}
