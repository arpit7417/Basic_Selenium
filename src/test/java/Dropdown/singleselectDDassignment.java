package Dropdown;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectDDassignment  {
	public static void main(String[] args)  throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement datalistDD=driver.findElement(By.name("my-select"));
		Select menu=new Select(datalistDD);
		menu.selectByIndex(1);
		Thread.sleep(1000);
		
		
	    menu.selectByValue("3");
	    Thread.sleep(1000);
		
		
		menu.selectByVisibleText("Three");
		Thread.sleep(1000);

		
		
		java.util.List<WebElement> li=menu.getOptions();
		
		
		for(WebElement i:li) {
			String str=i.getText();
			System.out.println(str);
		}
		driver.quit();
		
	}

}
