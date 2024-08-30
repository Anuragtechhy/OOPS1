package practise_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\software2\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@anuraggmail'");
		jse.executeScript("window.scrollBy(0,200)");
		
		
	}

}
