package Projects;
	import java.time.Duration;
	import org.openqa.selenium.By;

	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class FireFoxSecond
	{
	
		public static void main(String[] args) 
		{
			System.setProperty("FirefoxDriver.gecko.driver", "C:\\Selenium\\Web Driver\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
		

			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//driver.findElement(By.id("submit")).click();
			//driver.quit();
		}
		

	}
