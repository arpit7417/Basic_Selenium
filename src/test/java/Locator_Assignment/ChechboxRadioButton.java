package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechboxRadioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/singh/Downloads/assignment.html");
		
		WebElement forcheckbox=driver.findElement(By.id("checkbox1"));
		forcheckbox.click();
		System.out.println(" is check box is selected :"+forcheckbox.isSelected());
		
		
		WebElement maleRadio=driver.findElement(By.xpath("//input[@name='gender' and @value='male']"));
		maleRadio.click();
		System.out.println("male radio button selected"+maleRadio.isSelected());
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
