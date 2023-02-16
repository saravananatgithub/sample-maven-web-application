package com.mt.services;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

	@Test
	public void testCEO() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "C:/sarva/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://localhost:9090/sample/");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}

		try {
			System.out.println("-----%%%%%%%%-----"  + driver.getPageSource().contains("CEO: Bala Shanmugham"));			
			Assert.assertTrue(driver.getPageSource().contains("CEO: Saravanan"));
		} catch (Throwable th) {

			driver.quit();
			th.printStackTrace();
			Assert.fail();
		}
	}
}
