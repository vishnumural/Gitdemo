import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce_cs_xpth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://login.salesforce.com");
		   driver.findElement(By.id("username")).sendKeys("vishnubm");
		   driver.findElement(By.name("pw")).sendKeys("vbm123");
		   //the below statement will throws error because the class name have compound class.
		   //driver.findElement(By.className("button r4 wide primary")).click();
		   driver.findElement(By.xpath("//*[@id='Login']")).click();
		   // the below line dispays error mesage from site on console.
		   System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	
	}

}
