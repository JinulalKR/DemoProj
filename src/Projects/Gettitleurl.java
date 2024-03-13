package Projects;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gettitleurl {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("Title : "+ driver.getTitle());
		System.out.println("Current URL : "+driver.getCurrentUrl());
		driver.quit();
		}	
	
	}


