package Pratcice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
//this explains use of checkboxes and  find size of checkboxes in page.
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   Thread.sleep(2000);
		   driver.findElement(By.id("checkBoxOption1")).click();

		   System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		   driver.findElement(By.id("checkBoxOption1")).click();

		   	System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

//How to get the Count of number of check boxes present in the page

		   	driver.findElements(By.cssSelector("input[value='checkbox']")).size();      
		   
	     				   
	}

}
