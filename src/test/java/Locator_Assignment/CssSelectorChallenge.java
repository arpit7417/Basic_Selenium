package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorChallenge {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/singh/Downloads/assignment.html");
		WebElement  classinput=driver.findElement(By.cssSelector("input.text-field"));
	      classinput.sendKeys("class of selenium");
	      
	      Thread.sleep(3000);
	      classinput.clear();
	      
	      
	     WebElement atributeinput= driver.findElement(By.cssSelector("input[placeholder='Enter text here']"));
	      atributeinput.sendKeys("program by css selector");
	      Thread.sleep(3000);
	      driver.quit();
	      
	}

}
