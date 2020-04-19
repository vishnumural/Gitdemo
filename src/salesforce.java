import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://facebook.com");
		   driver.findElement(By.cssSelector("#email")).sendKeys("vishnubm");
		   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("vbm123");
		   //the below statement will throws error because the class name have compound class.
		   //driver.findElement(By.className("button r4 wide primary")).click();
		   driver.findElement(By.cssSelector("#loginbutton")).click();
		   //the belowone click on forgot password.
		   driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	}

}
