package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.className("dropdown-toggle"))).build().perform();
		driver.findElement(By.xpath("//*[@href='Frames.html']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
		
		//a.contextClick().build().perform();
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		//a.moveToElement(driver.findElement(By.xpath("//*[@class='analystic']"))).click().build().perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
