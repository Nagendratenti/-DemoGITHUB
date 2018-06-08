package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaynumberoflinnks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.in//");
		driver.manage().window().maximize();
		//number of the links in the page
		System.out.println("number of links in a page");
		System.out.println(driver.findElements(By.tagName("a")).size());

	
		//number of links footer of the page
		System.out.println("number of links in a footer");
		WebElement footer=driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
		System.out.println(footer.findElements(By.tagName("a")).size()); 
		
		//number of links footercol of the page
		System.out.println("number of links in a footercol");
		WebElement footercol=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(footercol.findElements(By.tagName("a")).size());
		for(int i=0;i<footercol.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(footercol.findElements(By.tagName("a")).get(i).getText());
		}
		driver.close();
	}

}
