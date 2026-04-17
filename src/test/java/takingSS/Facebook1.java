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

public class Facebook1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		//TakesScreenshot tks=(TakesScreenshot)driver;
		//File s1=tks.getScreenshotAs(OutputType.FILE);
		//File d1=new File("E:\\eclipse java\\E3_Basic_selenium\\src\\test\\java\\takingSS\\ss4.png");
		//FileHandler.copy(s1, d1);
		//driver.quit();
		
		WebElement ssc=driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")) ;
		File s1=ssc.getScreenshotAs(OutputType.FILE);
		File d1=new File("E:\\eclipse java\\E3_Basic_selenium\\src\\test\\java\\takingSS\\ss4.png");
		FileHandler.copy(s1, d1);
		driver.quit();
		
		
		
	}

}
