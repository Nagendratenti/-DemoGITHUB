package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://accounts.google.com//SignUp?hl=en-GB");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
