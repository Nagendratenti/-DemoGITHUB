package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D://JARS//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("email")).sendKeys("tnvdprasad@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("123456");
	driver.findElement(By.id("loginbutton")).click();
	driver.close();
	}

}
