package working_with_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailField=driver.findElement(By.name("email"));
		emailField.sendKeys("abhisingh232@gmail.com");
		
		WebElement passwordField=driver.findElement(By.name("pass"));
		passwordField.sendKeys("123455667");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
