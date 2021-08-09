

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
        
		//to get the rowCount
		List<WebElement> rows = driver.findElementsByXPath("//table[@id= 'table_id']//tr");
		int rowCount = rows.size();
		
		for(int i=2; i<= rowCount; i++) {  //row
			//to get the cell count
			List<WebElement> data = driver.findElementsByXPath("//table[@id= 'table_id']//tr["+i+"]/td");
			int dataCount = data.size();
			
		for(int j =1; j<= dataCount; j++) { //column
			
			String text = driver.findElementByXPath("//table[@id = 'table_id']//tr["+i+"]/td["+j+"]").getText();
			System.out.println(text);
		}
		
		}
	}
	
}
		
	
		
		
		
		
		
		
		
			
        
		

	
