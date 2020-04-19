import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//this example is for customized CSS
public class learnCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://facebook.com");
		   
		 //tagename[attribute='value']-CSS Syntax
		   
		   /*driver.findElement(By.path("//input[@type='email']")).sendKeys("Vishnubm@gmail.com");
		   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pratek123@");
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   driver.close();*/
		   driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vishnu");
		   driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
