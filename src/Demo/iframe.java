package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("September");
		
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		Thread.sleep(2000);
		//WebElement we=driver.findElement(By.xpath("//select[@class='selectnav']"));
		
		driver.findElement(By.name("fName")).sendKeys("Marolix");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
//		Select ab=new Select(we);
//		ab.selectByVisibleText("Contact");
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("World");
		
	}

}
