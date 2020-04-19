import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//this example is for customized CSS
public class learnalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   String text="Vishnu";

		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		   driver.findElement(By.id("name")).sendKeys(text);

		   driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		   System.out.println(driver.switchTo().alert().getText());

		   driver.switchTo().alert().accept();

		   driver.findElement(By.id("confirmbtn")).click();

		   System.out.println(driver.switchTo().alert().getText());

		   driver.switchTo().alert().dismiss();



		   }
	  
	}


