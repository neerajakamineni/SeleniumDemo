package encora;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 
//import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.encora.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	  	}

}


