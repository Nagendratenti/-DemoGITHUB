package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncwait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.in");
		WebDriverWait q=new WebDriverWait(driver,10);
		q.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='horus-shadowtext']"))).sendKeys("hyderabad");
		driver.findElement(By.xpath("//button[@class='btn btn--primary horus-btn-search']")).click();
		
				
	}

}
