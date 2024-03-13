package Projects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize(); 
		JOptionPane.showMessageDialog(null, "Click on 'Theme' is initiated !", "Click", JOptionPane.INFORMATION_MESSAGE);
		Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://jqueryui.com/themeroller/");       
    }
}
