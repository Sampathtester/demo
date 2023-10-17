package Demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		
		WebElement we=driver.findElement(By.id("alert"));
		we.click();
		
		Alert el=wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
//		WebElement we=driver.findElement(By.id("populate-text"));
//		we.click();
//		
//		WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h2")));
		
	//	WebElement wa=driver.findElement(By.id("h2"));
//		
//		System.out.println(w.isDisplayed());
		
		
//		WebElement we=driver.findElement(By.id("display-other-button"));
//		we.click();
//		
//		WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
//		
//		System.out.println(w.isDisplayed());
		
		
		
	}
	

}
