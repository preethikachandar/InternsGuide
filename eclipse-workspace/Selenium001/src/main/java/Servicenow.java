import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.id("filter")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Incidents'][1]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@value='sysverb_new']")).click();
		driver.findElement(By.id("incident.short description")).sendKeys("short description");
		
		//search field and enter then verify the incidentnumber created or not
		driver.switchTo().frame("gsft_main");
		String incNo = driver.findElement(By.xpath("//input[@id-_'incident.number']")).getAttribute("value");
		System.out.println("Incident number"+incNo);
		
	//Enter Incident in filter navigator and press enter
		driver.findElement(By.xpath("//a[@id-'incident_filter_toggle_image']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id-'incident_table_header_search_control'])[1]"));
		search.clear();
		search.sendKeys(incNo);
		
		//search for the existing incident and click on the incident 
		driver.findElement(By.xpath("//a[@class-'linked formlink']"));
		
		//update the incident with urgency as high and state as in progress
		driver.findElement(By.xpath("//select[@id-'incident.urgency']")).click();
		
		
		
		
	}

	}


