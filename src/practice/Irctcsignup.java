package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcsignup {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("vihaan7890");
		driver.findElement(By.id("userRegistrationForm:checkavail")).click();
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("Pappu789");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("Pappu789");
		
		Select que=new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
		que.selectByIndex(2);
		driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("lhschool");
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:prelan']")).click();
		driver.findElement(By.xpath("//*[@id='userRegistrationForm:prelan']/option[1]")).click();
		driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("prasad");
		driver.findElement(By.id("userRegistrationForm:middleName")).sendKeys("durga");
		driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("tnvd");
		driver.findElement(By.id("userRegistrationForm:gender:0")).click();
		driver.findElement(By.id("userRegistrationForm:maritalStatus:0")).click();
		
		Select date=new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));
		date.selectByIndex(13);
		driver.findElement(By.id("userRegistrationForm:dobMonth")).click();
		driver.findElement(By.xpath(".//*[@id='userRegistrationForm:dobMonth']/option[10]")).click();
		driver.findElement(By.id("userRegistrationForm:dateOfBirth")).click();
		driver.findElement(By.xpath("//*[contains(@value,'1988')]")).click();
		
		Select occu=new Select(driver.findElement(By.id("userRegistrationForm:occupation")));
		occu.selectByVisibleText("Others");
		Select country=new Select(driver.findElement(By.id("userRegistrationForm:countries")));
		country.selectByValue("94");
		
		driver.findElement(By.id("userRegistrationForm:email")).sendKeys("sadhu4158@gmail.com");
		driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("8919384969");
		
		Select nationality=new Select(driver.findElement(By.id("userRegistrationForm:nationalityId")));
		nationality.selectByVisibleText("India");
		driver.findElement(By.id("userRegistrationForm:address")).sendKeys("16-13*5/a1");
		driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("533437");
		driver.findElement(By.id("userRegistrationForm:statesName")).click();
		Thread.sleep(3000);
		Select dist=new Select(driver.findElement(By.xpath("//Select[@id='userRegistrationForm:cityName']")));
		dist.selectByIndex(1);
		Thread.sleep(3000);
		Select post=new Select(driver.findElement(By.id("userRegistrationForm:postofficeName")));
		post.selectByValue("Peddapuram S.O");
		driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("9741212223");
		driver.findElement(By.id("userRegistrationForm:resAndOff:0")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
