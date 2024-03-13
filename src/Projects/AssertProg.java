package Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssertProg {
@Test
public void Case1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
				WebElement checkbox = driver.findElement(By.id("englishchbx"));
				checkbox.click();
				//Assert.assertFalse(driver.findElement(By.id("englishchbx")).isSelected());
				Assert.assertFalse(driver.findElement(By.id("hindichbx")).isSelected());
				System.out.println("False Assert");
	
	}
/*@Test
public void Case2()
	{
	

				String actualText="Expected Test1";
				String expectedText="Expected Test";
				Assert.assertEquals(actualText,expectedText);
				System.out.println("Assert Equals");
	}*/
	
}
