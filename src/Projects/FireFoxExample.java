package Projects;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxExample {
    public static void main(String[] args) {
       
    	System.setProperty("FirefoxDriver.gecko.driver", "C:\\Selenium\\Web Driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.example.com");

        driver.quit();
    }
}