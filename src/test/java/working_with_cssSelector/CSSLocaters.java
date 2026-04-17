package working_with_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocaters {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//tag id
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
		//Thread.sleep(3000);
	//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone");
	//	Thread.sleep(3000);
		
		
		
		// tag classname
	//	driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Tshirt");
		//Thread.sleep(3000);
		//driver.quit();
	//	driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("Tshirt");
		//Thread.sleep(3000);
		//driver.quit();
		
		//tag [av=an]
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("tshirt");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
