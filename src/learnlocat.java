import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//this example is for customized xpath
public class learnlocat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://facebook.com");
		 //tagname[@attribute='value']
		   //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Vishnubm@gmail.com");
		   //using regularexpression
		   driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Vishnubm@gmail.com");
		   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pratek123@");
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   driver.close();
	}

}
