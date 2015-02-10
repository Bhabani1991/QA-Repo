
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleDemoTestNg {
	
	
	WebDriver driver ;


		 @BeforeMethod

		 public void g1(){
		  
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		//System.out.println("Hello");

		 }

		 @Test

		 public void c1(){
			 
			 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 WebElement element = driver.findElement(By.name("q"));
		     element.sendKeys("Software Testing");
		     element.submit();
			 //System.out.println("Hello India");
		 }
		 
		/* @Test
		 public void b1(){

			 System.out.println("Hello Pune");
		 }
*/
		 @AfterMethod

		 public void d1(){
		
		//System.out.println("Hello World");
		driver.quit();

		 
		 } 
		 
		 
		 
		 //New latest code 
		 
		 
		 @Test
		 
		 public void test(){
			 
			 
			 //Hello new code
		 }
		 
		 
		 @Test
		 
		 //New SampleModel
		 
		 
		 public void masterBranchcode(){
			 
			 
			 sys("Masterbranchcode")
		 }
		 
		 
		 
		 
		 
	
	

	}


