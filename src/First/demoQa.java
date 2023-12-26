package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91797\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");


	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	d.navigate().to("https://demoqa.com/slider");
	d.findElement(By.xpath(
			"//input[@value=\"100\"][@class=\"range-slider range-slider--primary\"]"));
	
	
}
}
