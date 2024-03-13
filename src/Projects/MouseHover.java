package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			//driver.manage().window().maximize();
			
			WebElement we = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
			Actions act=new Actions(driver);
			act.moveToElement(we);

		
	}

}
