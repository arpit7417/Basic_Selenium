package wd_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Wd_method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://web.whatsapp.com/");
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		//driver.quit();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize()	;
		Thread.sleep(500);
		//driver.close();
		//driver.manage().window().fullscreen();
		//Thread.sleep(500);
		//driver.close();
		Window win=driver.manage().window();
		Dimension dim=win.getSize();
		
		System.out.println(dim);
		int h=dim.getHeight();
		int w=dim.getWidth();
		System.out.println(h+" "+w);
		Dimension dim2=new Dimension(1000,400);
		win.setSize(dim2);
		Point pt=win.getPosition();
		System.out.println(pt);
		
		System.out.println("x is" +pt.getX());
		System.out.println("y is "+ pt.getY());
		Point p2=new Point(200,300);
		win.setPosition(p2);
		
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
	}

}
