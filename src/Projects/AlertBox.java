package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertBox {

	public static void main(String[] args) throws Exception 
	{
		// Google Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		/*Firefox
		System.setProperty("FirefoxDriver.gecko.driver", "C:\\Selenium\\Web Driver\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver1.manage().window().maximize();*/

		/* Simple Alert !
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();*/
		
		/* Confirmation Alert !
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());*/
		
		/* Prompt Alert !*/
		// For Google Chrome
		
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		//Thread.sleep(1000);
		driver.findElement(By.id("promptBox")).sendKeys("Text");
		//driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		/* for Firefox Browser
		
		driver1.findElement(By.id("promptBox")).click();
		System.out.println(driver1.switchTo().alert().getText());
		//Thread.sleep(1000);
		driver1.findElement(By.id("promptBox")).sendKeys("Text");
		//driver.switchTo().alert().sendKeys("Test");
		driver1.switchTo().alert().accept();
		System.out.println(driver1.findElement(By.id("output")).getText());*/
		
}
}
