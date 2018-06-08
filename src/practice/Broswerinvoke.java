package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Broswerinvoke {

	public void invoke() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	public static void main(String[] args) {
		//to launch chrome browser
		
	/*	System.setProperty("webdriver.chrome.driver","D://JARS//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
         System.out.println(driver.getCurrentUrl());
         driver.close();
	
		*/
	}

	
	}

