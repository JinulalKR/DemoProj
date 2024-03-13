package Projects;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException
		{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number\n");
		int num=scan.nextInt(); 
		 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File f= ts.getScreenshotAs(OutputType.FILE);
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\jinul\\Desktop\\Selenium\\"+num+".jpg"));
	
	

	}

}
