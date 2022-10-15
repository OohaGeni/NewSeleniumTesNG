package com.Selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Sample {
		public String baseUrl = "https://subscribe.stctv.com/";
		
	WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"changeLanguageButton\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div[2]/a[1]")).click();
		System.out.println("Initially KSA(Saudi Arabia) Country page appears");
		Thread.sleep(3000);
		
		//Now select Bahrain and check for the plans & price
		System.out.println("select Bahrain and check for the plans & price");
		driver.findElement(By.id("bh")).click();
		System.out.println("Bahrain Country page appears");
		System.out.println("Lists the Bahrain Country Plans Lite, Classic and Premium and currency of each");
		
		driver.findElement(By.className("package-container"));
		//Now selecting the Bahrain package plan LITE
		driver.findElement(By.className("packages-btn")).click();
		Thread.sleep(1000);
		System.out.println("Bahrain Country plan LITE selected");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
        ////Now selecting the Bahrain package plan CLASSIC
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/section/div/div/div[2]/button")).click();
		Thread.sleep(1000);
		System.out.println("Bahrain Country plan CLASSIC selected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
		
		//Now selecting the Bahrain package plan PREMIUM
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/section/div/div/div[3]/button")).click();
		System.out.println("Bahrain Country plan PREMIUM selected");
		Thread.sleep(1000);
		
		//Navigates to previous page 
		driver.navigate().back();
	
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		
		//Now select Kuwait and check for the plans & price 
		System.out.println("select Kuwait and check for the plans & price");
		
		driver.findElement(By.id("kw")).click();
		System.out.println("Kuwait Country page appears");
		Thread.sleep(2000);
		System.out.println("Lists the Kuwait Country Plans Lite, Classic and Premium and currency of each");
		driver.findElement(By.className("package-container"));
		//Now selecting the Kuwait package plan LITE
		driver.findElement(By.className("packages-btn")).click();
		Thread.sleep(1000);
		System.out.println("Kuwait Country plan LITE selected");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
        //Now selecting the Kuwait package plan CLASSIC
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/section/div/div/div[2]/button")).click();
		Thread.sleep(1000);
		System.out.println("Kuwait Country plan CLASSIC selected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
		//Now selecting the Kuwait package plan PREMIUM
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/section/div/div/div[3]/button")).click();
		Thread.sleep(1000);
		System.out.println("Kuwait Country plan Premium selected");
		
		//Navigates to previous page
		driver.navigate().back();
		
		//Now select KSA(Saudi Arabia) and check for the plans & price
		System.out.println("select KSA(Saudi Arabia) and check for the plans & price");
		
		System.out.println("KSA(Saudi Arabia) Country page appears");
		System.out.println("Lists the SA Country Plans Lite, Classic and Premium and currency of each");
		Thread.sleep(2000);
		driver.findElement(By.className("package-container"));
		//Now selecting the KSA package plan LITE
		driver.findElement(By.className("packages-btn")).click();
		Thread.sleep(1000);
		System.out.println("KSA Country plan LITE selected");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
        ////Now selecting the KSA package plan CLASSIC
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/section/div/div/div[2]/button")).click();
		Thread.sleep(1000);
		System.out.println("KSA Country plan CLASSIC selected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
		
		//Now selecting the KSA package plan PREMIUM
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/section/div/div/div[3]/button")).click();
		System.out.println("KSA Country plan PREMIUM selected");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"minisub-container\"]/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed successfully");
	}
}
