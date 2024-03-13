package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().window().maximize();
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\jinul\\Desktop\\Selenium\\Mouse Hover Code.jpg");
		//driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\jinul\\Desktop\\Selenium\\Mouse Hover Code.jpg");
		
	}

}
