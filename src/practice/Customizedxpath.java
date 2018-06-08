package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizedxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("tnvdprasad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
