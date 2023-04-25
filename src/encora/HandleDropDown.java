package encora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(5000);
		WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		Select drpCountry =  new Select(drpCountryEle);
		drpCountry.selectByVisibleText("Australia");
		drpCountry.selectByIndex(10);
		drpCountry.selectByValue("13");
		// selecting option from dropdown without using methods
		List<WebElement> alloptions = drpCountry.getOptions();
		for(WebElement options:alloptions) {
			if(options.getText().equals("Cuba")) {
				options.click();
				break;
			}
		}
			
		
		
	}

}
