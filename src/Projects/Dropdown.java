package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//driver.manage().window().maximize();
		
		//WebElement dd = driver.findElement(By.id("course"));
		WebElement dd = driver.findElement(By.id("BlogArchive1_ArchiveMenu"));
		//BlogArchive1_ArchiveMenu
		Select sel=new Select(dd);
		//sel.selectByIndex(2);
		//sel.selectByValue("java");
		//sel.selectByVisibleText("Java");
		sel.selectByVisibleText("February (10)");
				

	}

}
