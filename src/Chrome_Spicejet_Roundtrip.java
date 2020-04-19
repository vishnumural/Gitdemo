import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Chrome_Spicejet_Roundtrip {
//Customized css
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.spicejet.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   //System.out.println(driver.findElement(By.cssSelector("Input[id*='SeniorCitizen']")).isSelected());
		   //driver.findElement(By.cssSelector("Input[id*='SeniorCitizen']")).click();
		   //System.out.println(driver.findElement(By.cssSelector("Input[id*='SeniorCitizen']")).isSelected());
		   		
		   // find the number of check boxes on the page.
		   //System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		   driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
			   System.out.println("Radio button is ebabled");
			   Assert.assertTrue(true);
	}
		   else
		   {
			   Assert.assertTrue(false);
		   }
		   
		   
		   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		   driver.findElement(By.xpath("//a[@value='BLR']")).click();
		   driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();	
		   // this is not best practice to use index, better useparent child xpath
		   //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		   //use below parent child xpath option//
		   driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		   driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		   //.ui-state-default.ui-state-highlight.ui-state-active
		   
		   driver.findElement(By.id("divpaxinfo")).click();
				  
		   Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		   s.selectByValue("2");
		   Select c= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		   c.selectByValue("1");
		   Select i= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		   i.selectByValue("1");	
		   
		   Select currency= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		   currency.selectByValue("USD");
		   
		   driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		   
		   
		   
/*		   driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/

		   /*System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText( */
	}

}
