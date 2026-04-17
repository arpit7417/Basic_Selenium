package working_with_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethod {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Arpit");
		Thread.sleep(3000);
		username.clear();
		
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		//loginbutton.clear();
		
		String textoflogin=loginbutton.getText();
		System.out.println("text of login :"+textoflogin);
		
		
		System.out.println("loginbutton font color :"+ loginbutton.getCssValue("color"));
		
		
		if(loginbutton.isDisplayed()) {
			if(loginbutton.isEnabled()) {
				loginbutton.submit();
			}else {
				System.out.println("loginbutton is not enabled..");
			} 
		}else {
				System.out.println("loginbutton is not visible..");
			}
		}
}
		
		
		
		

	


