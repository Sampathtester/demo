package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.querySelector(\"[name='test']\").disabled=false");
		driver.findElement(By.name("test")).sendKeys("September");
		
		
	}

}
