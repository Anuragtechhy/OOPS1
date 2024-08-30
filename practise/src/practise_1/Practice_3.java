package practise_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_3 {
	
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\software2\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement wm=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement wt=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.dragAndDrop(wm, wt).build().perform();
		act.dragAndDropBy(wm, 25, 0).build().perform();
		
		System.out.println("good anurag");
		
		
	}
}