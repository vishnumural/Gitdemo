import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Chrome_makemytrip {
//Customized css
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.makemytrip.com");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.findElement(By.id("fromCity")).click();		      
		   driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		   WebElement source=(driver.findElement(By.xpath("//input[@placeholder='From']")));		   
		   source.sendKeys("BOM");
		   Thread.sleep(2000);
		   source.sendKeys(Keys.ENTER);
		   source.sendKeys(Keys.ARROW_DOWN);
		   source.sendKeys(Keys.ENTER);
		   
		   /* replacebelow code with web element in above line
		   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("BOM");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);*/
		   
		 //input[@placeholder='To']
		   driver.findElement(By.id("toCity")).click();		      
		   driver.findElement(By.id("toCity")).sendKeys(Keys.ENTER);
		   WebElement destin=(driver.findElement(By.xpath("//input[@placeholder='To']")));		   
		   destin.sendKeys("BLR");
		   Thread.sleep(2000);
		   destin.sendKeys(Keys.ENTER);
		   destin.sendKeys(Keys.ARROW_DOWN);
		   destin.sendKeys(Keys.ENTER);
		   
	}

}
