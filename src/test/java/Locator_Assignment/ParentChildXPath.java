package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/singh/Downloads/assignment.html");
		
		WebElement button=driver.findElement(By.xpath("//div[@class='child']/button"));
		button.click();
		System.out.println("button clicked successfully"+button.isSelected());
		
		Thread.sleep(3000);
		driver.quit();
	}

}
