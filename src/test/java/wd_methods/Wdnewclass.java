package wd_methods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Wdnewclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
		Thread. sleep(10000);
		//driver.close();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		//driver.quit();
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.close();
		//driver.manage().window().minimize();
		//Thread.sleep(2000);
		//driver.close();
		//driver.manage().window().fullscreen();
		//Thread.sleep(2000);
		//driver.close();
		Window win=driver.manage().window();
		win.maximize();
		Thread.sleep(2000);
		//driver.close();
		Dimension dim=win.getSize();
		System.out.println(dim);
		int height=dim.getHeight();
		//System.out.println(height);
		int width=dim.getWidth();
		//System.out.println(width);
		System.out.println(width+"  "+height);
		Dimension dim2=new Dimension(500,1333);
		win.setSize(dim2);
		Point pt=win.getPosition();
		System.out.println(pt);
		System.out.println("x :"+ pt.getX());
		System.out.println("y :"+ pt.getY());
		Point pt2=new Point(8333, 8474);
		win.setPosition(pt2);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
