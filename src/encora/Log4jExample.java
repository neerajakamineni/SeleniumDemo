package encora;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jExample {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Log4jExample");
		DOMConfigurator.configure("Log4j.xml");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Browser opened");
		driver.get("https://www.encora.com/");
		driver.manage().window().maximize();

	}

}
