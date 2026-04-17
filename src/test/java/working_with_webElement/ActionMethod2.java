package working_with_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethod2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement male=driver.findElement(By.cssSelector("input[value='2']"));
		male.click();
		
		String  tagOfmale=male.getTagName();
		System.out.println("tagOfmale is :"+ tagOfmale);
		
		String valueoftype =male.getAttribute("type");
		System.out.println(valueoftype);
		
		Thread.sleep(3000);
		
		
		
		
		
		if(male.isSelected()) {
			System.out.println("male is selected");
		} else {
			System.out.println("Male is not selected");
		}
		driver.quit();
		
		
		
	}

}
