package Realestate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Realestate {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PriyankaMandadi\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//String baseUrl = "http://realty-real-estatem1.upskills.in/";
		//driver.get(baseUrl);
		login.login();
		System.out.println("log-in successfull");
		driver.quit();
	    System.out.println("Closed the browser");
}

}