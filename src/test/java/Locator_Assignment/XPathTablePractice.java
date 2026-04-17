package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTablePractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/singh/Downloads/assignment.html");
		
		
		WebElement secondrow =driver.findElement(By.xpath("//table[@id='sampleTable']/tbody/tr[2]"));
		System.out.println("secondrow text is"+secondrow.getText());
		
		WebElement thirdcolumn=driver.findElement(By.xpath("//table[@id='sampleTable']/tbody/tr[3]/td[last()]"));
		System.out.println("thirdcolumn is:"+ thirdcolumn.getText());
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
