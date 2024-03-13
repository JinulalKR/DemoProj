package Projects;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class UnamePwd
	{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
		
			//implicit wait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("submit")).click();
			//driver.quit();
		}
		

	}
