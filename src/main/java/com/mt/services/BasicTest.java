package com.mt.services;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	@Test
	public void testCEO() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("http://localhost:9090/sample/");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}

		try {
			System.out.println("-----%%%%%%%%-----" + driver.getPageSource().contains("CEO: Bala Shanmugham"));

			Assert.assertTrue(driver.getPageSource().contains("CEO: Bala Shanmugham"));

			System.out.println("----------" + driver.getPageSource().contains("CEO: Bala Shanmugham"));
		} catch (Throwable th) {

			driver.quit();
			th.printStackTrace();
			Assert.fail();
		}
	}
}
