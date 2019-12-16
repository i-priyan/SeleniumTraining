package Realestate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	
		static void login() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\PriyankaMandadi\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			String baseUrl = "http://realty-real-estatem1.upskills.in/";
			driver.get(baseUrl);
			 driver.findElement(By.className("sign-in")).click();
			 WebElement Username= driver.findElement(By.id("user_login"));							
			 WebElement Password= driver.findElement(By.name("pwd"));							
			 Username.sendKeys("admin");					
			 Password.sendKeys("admin@123");					
		     System.out.println("Entered User name & Password");
		     driver.findElement(By.name("login")).click();
		     System.out.println("User login successfully done");
		     driver.findElement(By.className("Posts")).click();
			WebElement element=driver.findElement(By.className(“All Posts”));
			String text=element.getText();
		    
		}
	}

		



