package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://imgbb.com");
		driver.findElement(By.xpath("//a[@class='btn btn-big blue']")).click();
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("\"D:\\Images\\img.jpg\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
}
