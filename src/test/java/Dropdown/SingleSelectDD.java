   package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dayDD=driver.findElement(By.id("day"));
		Select selDay =new Select(dayDD);
		selDay.selectByIndex(0);
		
		Thread.sleep(3000);
		//driver.quit();
		
		WebElement monthDD =driver.findElement(By.id("month"));
		Select selMonth=new Select(monthDD);
		selMonth.selectByValue("6");
		
		
		WebElement yearDD=driver.findElement(By.id("year"));
		Select selYear=new Select(yearDD);
		selYear.selectByVisibleText("2020");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
