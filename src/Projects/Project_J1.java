package Projects;

import org.openqa.selenium.chrome.ChromeDriver;

public class Project_J1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
				
		System.out.println("This is test");

	}

}
