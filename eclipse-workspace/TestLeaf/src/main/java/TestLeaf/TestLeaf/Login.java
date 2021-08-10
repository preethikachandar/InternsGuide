package TestLeaf.TestLeaf;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.keys;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("gsft_main");
		driver.findElementBy.Id("user_name").sendkeys("admin");
		driver.findElementBy.Id("user_password").sendkeys("m3GkKEKU8atr");
		driver.findElemntBy.Id("sysverb_login").click();
		driver.findElementBy.Id("filter").sendkeys("incident");
		driver.findElementBy.Id("filter").sendkeys(Keys.Enter);
		
		driver.findElementsByXpath("//div[text()-'incidents'][1]").click();
		driver.switchTo().frame("gsfl_main");
		driver.findElementByXPath("//button[@value-'sysverb_new']").click();
		driver.findElementById("incident.short description".sendKeys("short description");
			
	}
	
		

	}

}
