import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {

	public static void main(String[] args) throws IOException, InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
   WebDriver driver=new ChromeDriver(); 
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.get("http://google.com");
   
   TakesScreenshot scrShot=((TakesScreenshot)driver);
   File src=scrShot.getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(src,new File("C://Prateek//ss.png"));
   
   Thread.sleep(2000);
   //validate whether  page title
   System.out.println (driver.getTitle());
   //validate whether landed on correct url
   System.out.println(driver.getCurrentUrl());
   //Print page source
   //System.out.println(driver.getPageSource());
   driver.get("http://yahoo.com");
   driver.navigate().back();
   driver.navigate().forward();
   Thread.sleep(2000);
   //close the browser in focus
   driver.close();
   //closes all browsers opened
   //driver.quit();
	}

}
