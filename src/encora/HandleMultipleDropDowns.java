package encora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HandleMultipleDropDowns {
	 WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(5000);
		//Approach 1
		/*
		 * Select noofEmpsDrop = new
		 * Select(driver.findElement(By.name("NoOfEmployees"))); Select industryDrop =
		 * new Select(driver.findElement(By.name("Industry"))); Select countryDrop = new
		 * Select(driver.findElement(By.name("Country")));
		 */
		//Approach 2
		WebElement noofEmpele = driver.findElement(By.name("NoOfEmployees"));
		selectOptionFromDropdown(noofEmpele, "16 - 20");
		WebElement industryele = driver.findElement(By.name("Industry"));
		selectOptionFromDropdown(industryele, "Healthcare");
		WebElement countryEle = driver.findElement(By.name("Country"));
		selectOptionFromDropdown(countryEle, "Ghana");
		
        }
	public static void selectOptionFromDropdown(WebElement ele, String value) {
		Select drp = new Select(ele);
		List<WebElement> alloptions = drp.getOptions();
		for(WebElement option:alloptions) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
		
	}

}
