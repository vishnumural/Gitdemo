import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learncustomizedpathcss {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://facebook.com");
		   driver.findElement(By.id("email")).sendKeys("Vishnubm@gmail.com");
		   driver.findElement(By.name("pass")).sendKeys("Pratek123@");
		   driver.findElement(By.linkText("Forgot account?")).click();
		   //driver.close();
	}

}
