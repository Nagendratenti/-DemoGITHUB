package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("sadhuroyal");
		driver.findElement(By.name("LastName")).sendKeys("tenti");
		driver.findElement(By.id("GmailAddress")).sendKeys("sadhuroyal7890");
		driver.findElement(By.name("Passwd")).sendKeys("sadhu1234");
		driver.findElement(By.id("PasswdAgain")).sendKeys("sadhu1234");
		driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=':a']")).click();
		driver.findElement(By.xpath("//*[@id='BirthDay']")).sendKeys("14");
		driver.findElement(By.xpath("//*[@id='BirthYear']")).sendKeys("1988");
		driver.findElement(By.xpath("//*[@id='Gender']/div")).click();
		driver.findElement(By.xpath("//*[@id=':f']")).click();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9741212223");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("sadhu4158@gmail.com");
		driver.findElement(By.id(":i")).click();
		driver.findElement(By.xpath("//*[@id=':3k']/div")).click();
		//driver.findElement(By.id("TermsOfService")).click();
		driver.findElement(By.name("submitbutton")).click();
		
		
		
		
    
        
	}

}
