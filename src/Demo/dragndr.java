package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndr {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//div[@id='box3']"));
		
		WebElement des= driver.findElement(By.xpath("//div[text()='United States']"));
		
		
		act.dragAndDrop(src, des).build().perform();
		
		
		
		
	}

}
