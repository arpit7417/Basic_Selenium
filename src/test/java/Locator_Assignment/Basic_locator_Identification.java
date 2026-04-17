package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_locator_Identification {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/singh/Downloads/assignment.html");
		
		
		WebElement buttonid=driver.findElement(By.id("btn1"));
		System.out.println("buttonid is: "+buttonid);
		
		WebElement buttonname=driver.findElement(By.name("submit"));
		System.out.println("buttonname is"+ buttonname);
		
		WebElement buttonclassname=driver.findElement(By.className("btn-class"));
		System.out.println("buttonclassname is:"+buttonclassname);
		
		WebElement  buttontagname=driver.findElement(By.tagName("button"));
		System.out.println("buttontagname is"+ buttontagname);
		
		WebElement buttonlinktext=driver.findElement(By.linkText("Idhar"));
		System.out.println("buttonlinktext is "+ buttonlinktext);
		driver.quit();
		
		
	}

}
