package Projects;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AmazonKey 
	{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Keyboard");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//driver.quit();
		}
		

	}

