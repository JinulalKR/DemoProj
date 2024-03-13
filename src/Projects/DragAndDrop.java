package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Test;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{		
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement w = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(w);
	Actions a = new Actions(driver);
	a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")), driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"))).build().perform();
	Thread.sleep(2000);
	
	//driver.navigate().refresh();
	
	}

}
