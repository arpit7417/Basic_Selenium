package takingSS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomato {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.zomato.com/ncr");
		
		// Taking screenshot of webpage
		TakesScreenshot tks= (TakesScreenshot) driver;
	    File source=	tks.getScreenshotAs(OutputType.FILE);
	     File destination=new File("E:\\eclipse java\\E3_Basic_selenium\\src\\test\\java\\takingSS\\ss3.png");
	     FileHandler.copy(source, destination);
	    driver.quit();
	     
	     
		
	}

}
