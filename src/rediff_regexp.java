import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_regexp {

	public static void main(String[] args) {
		// regular expression example
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://rediff.com");
		   driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		   driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("visnubm");
	       driver.findElement(By.cssSelector("input#password")).sendKeys("login");
	       driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
