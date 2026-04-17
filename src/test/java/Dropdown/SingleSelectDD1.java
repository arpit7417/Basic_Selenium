package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDD1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dayDD=driver.findElement(By.id("day"));
		Select selDay =new Select(dayDD);
		selDay.selectByIndex(0);
		
		Thread.sleep(3000);
		
		WebElement monthDD =driver.findElement(By.id("month"));
		Select selMonth=new Select(monthDD);
		selMonth.selectByValue("6");
		
		List<WebElement> months=selMonth.getOptions();
		System.out.println(months.get(7).getText());
		
		for(WebElement i: months) {
			String  text=i.getText();
			System.out.println(text);
		}
		WebElement yearDD=driver.findElement(By.id("year"));
		Select selYear=new Select(yearDD);
		selYear.selectByVisibleText("2020");
	}

}
