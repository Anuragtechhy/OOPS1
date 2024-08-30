package practise_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_1 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\software2\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	String text1=	driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
	System.out.println(text1);
	driver.findElement(By.xpath("//a[@role='button'][@data-testid]")).click();
	

List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));

System.out.println("radio size:"  + radio.size());

// HANDLING AUTOSUGGESTION IN GOOGLE

driver.navigate().to("https://www.google.com/");
driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("why taliban");
List<WebElement> tb= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
for(int i=0;i<tb.size();i++) {
	String orig = "Why taliban not helping hamas";
	if(tb.get(i).getText().equalsIgnoreCase(orig)) {
		tb.get(i).click();
	break;
}
}














	
	
	}
}