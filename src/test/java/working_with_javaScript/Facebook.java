package working_with_javaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='admin';");
		
		jse.executeScript("document.getElementById('pass').value='admin@12345';");
		
		jse.executeScript("document.getElementsByName('login').click;");
		
		
		
		// WebElement username=driver.findElement(By.id("email"));
		// username.sendKeys("arpit");
		// Thread.sleep(3000);
	//	 WebElement pass= driver.findElement(By.id("pass"));
		// pass.sendKeys("aerpifbj");
	//	 Thread.sleep(3000);
	//	 WebElement logn=driver.findElement(By.name("login"));
	//	 logn.click();
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	
		
		
		 
		
		
	}

}
