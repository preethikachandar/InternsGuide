import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class assessment {

	private static String opn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("username")).sendKeys("nupela@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("Login")).click();
		
		//click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
		
		 //Click view All
		driver.findElement(By.xpath("//button[text() = 'View All']")).click();
		driver.findElement(By.xpath("//p[text() = 'Service Console']")).click();
		
		//Select Home from the DropDown
		driver.findElement(By.xpath("//span[@class = 'slds-media_body']")).click();
		
		//Add CLOSED + OPEN values and result should set as the GOAL (If the result is less than 10000 then set the goal as 10000)
		
		String closed = driver.findElement(By.xpath("//span[text() = 'Closed')/following-sibling::span")).getText();
		String cls = closed.replaceAll("[\\D]", "");
		int closedFinal = Integer.parseInt(cls);
		int openFinal = Integer.parseInt(opn);
		
		int total = closedFinal+openFinal;
		System.out.println(total);
		
		System.out.println("Addition of closed and open is" +total);
		
		driver.findElement(By.xpath("//button[@title = 'Edit Goal']")).click();
		
		WebElement edit = driver.findElement(By.xpath("//span[@id = 'currencyCode']/following-sibling::input"));
		edit.clear();
		edit.sendKeys("10,000");
		driver.findElement(By.xpath("//span[text()= 'Save']")).click();
		String goalText = driver.findElement(By.xpath("//spa[text() ='Goal']/following-sibling::span")).getText();
		
		
		
		
		
		
		
		
				
		
		
        
	}

}
