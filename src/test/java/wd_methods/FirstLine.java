package wd_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLine {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FireFoxDriver();
		     //    driver=new EdgeDriver();
		   //         driver=new FireFoxDriver();
		          driver.get("https://www.instagram.com/");
		          driver.get("https://www.facebook.com/");
		          String title=driver.getTitle();
		          System.out.println(title);
		         String currenturl=driver .getCurrentUrl();
		          System.out.println(currenturl);
		          String pageSource=driver.getPageSource();
		         System.out.println(pageSource);
		        	  
		
	}

}
