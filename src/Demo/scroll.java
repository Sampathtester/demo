package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,700)");
		
        WebElement we=driver.findElement(By.xpath("//td[.='India']"));
		js.executeScript("arguments[0],scrollIntoview();",we);
		
		Point loc=we.getLocation();
		
		js.executeScript("window.scrollBy"+loc);
		
	}

}
