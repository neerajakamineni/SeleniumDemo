package encora;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandleJqueryDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//selectChoiceValues(driver, "choice 1");
		//selectChoiceValues(driver, "choice 2, choice 3, choice 2 3, choice 6, choice 6 2 1, choice 6 2");
		selectChoiceValues(driver, "all");

	}

		public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item :choicelist) {
				String text = item.getText();
				for(String val: value) {
					if(text.equals(value)) {
						item.click();
						break;
					}
				}
			}
		}
		else {
			try {
				for(WebElement item :choicelist) {
					item.click();
				}
			}
			catch(Exception e) {
				
			}
			
		}
		
		
	}

}
