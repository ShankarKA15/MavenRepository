package com.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class fbpage {
	WebDriver driver;
	@Test(priority=1)
	public void OpenBrowser()throws Exception
	{
				
		
			//Saved the chrome driver in local folder
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Jarfiles\\Driver\\chromedriver_92.exe");			
			/*Map<String, Object> prefs = new HashMap<String, Object>();			
			prefs.put("profile.default_content_setting_values.notifications", 2);			
			ChromeOptions options = new ChromeOptions();	*/		
			//options.setExperimentalOption("prefs", prefs);			
			driver = new ChromeDriver();			
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	public void TC01_login(String username, String password)
	{	
		WebElement UserID=driver.findElement(By.id("email"));		
		WebElement Password=driver.findElement(By.id("pass"));
		WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));		
		//String variable created for the username and password
		
		UserID.clear();
		UserID.sendKeys("shan.kln86@gmail.com");
		Password.clear();
		Password.sendKeys("733577");
		Login.click();	
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}

}
