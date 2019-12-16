package Realestate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Post {
	static void post() {
		login.login();
		driver.findElement(By.className("Posts")).click();
		WebElement element=driver.findElement(By.className(“All Posts”);
		String text=element.getText();
		//System.out.println(+text,"is displayed");
		//If(text.contains(“All Posts”){
		//System.out.println(“Expected text is displayed”);
		//}else{
		//System.out.println(“Expected text is not displayed”);
		//}
}
}
