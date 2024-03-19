package Projects;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class AutomationProject 
{
	public static void main(String[] args)  throws IOException,InterruptedException 
	//public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.bookswagon.com/");
		driver.manage().window().maximize();
		System.out.println("Title : "+ driver.getTitle());
		System.out.println("Current URL : "+driver.getCurrentUrl());
	
		driver.findElement(By.id("inputbar")).sendKeys("Alchemist");
		driver.findElement(By.id("btnTopSearch")).click();
		driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[1]/div[4]/div[4]/input[1]")).click();
		
		Thread.sleep(5000);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\jinul\\Desktop\\Selenium\\Screenshots\\"+"Cartscreenshot.jpg"));
		
		}	
	}


