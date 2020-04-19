import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSUSAGE_09 {
//Customized css
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://login.salesforce.com");
		   driver.findElement(By.cssSelector("[type='email']")).sendKeys("vishnubm");
		   driver.findElement(By.cssSelector("[type='password']")).sendKeys("vbm123");
		   driver.findElement(By.cssSelector("[type='submit']")).click();
		   
	}

}
