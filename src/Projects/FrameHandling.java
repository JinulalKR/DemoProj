package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
		Select crs = new Select(drop);
		crs.selectByVisibleText("-- TestNG");
		Thread.sleep(3000);
	}

}
