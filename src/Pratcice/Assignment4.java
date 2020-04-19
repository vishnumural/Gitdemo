package Pratcice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   Thread.sleep(2000);
		      
		   System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).isSelected());
		   		   driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).click();
		   Thread.sleep(2000);
		   System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).isSelected());
		   Thread.sleep(2000);
		   System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		  
   
				   
	}

}
