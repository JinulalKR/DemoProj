package first;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Pomodel 
{
@ Test	
public void facebook()
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Web Driver\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Pomodel2 lpage=new Pomodel2(driver);
	lpage.username();
	lpage.password();
	lpage.login();
}

}
