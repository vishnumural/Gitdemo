package Pratcice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Autosuggestive {
	// 1. Give me the count of links on the page.
	// 2. Count of footer section-
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("United");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor cont=(JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String)cont.executeScript(script);
	    System.out.println(text);
		int k=0;
		while(!text.equalsIgnoreCase("United state (USA")) {
			k++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) cont.executeScript(script);
			System.out.println(text);
			if (k > 10) {
				break;
				}
			if (k > 10) {
				System.out.println("United States (USA) is  found");
			} 
			else 
			{
				System.out.println("United States (USA) not found");
			}
	}

}}
