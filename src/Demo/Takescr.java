package Demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescr {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        
        driver.manage().window().maximize();
        
        WebElement we=driver.findElement(By.xpath("//img[@alt='Facebook']"));
        File src=we.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\scr\\image.png");
        FileUtils.copyFile(src,trg);
		
	}

}
