package s1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.google.com/");
d.findElement(By.name("q")).sendKeys("software Testing");
d.close();
	}

}
