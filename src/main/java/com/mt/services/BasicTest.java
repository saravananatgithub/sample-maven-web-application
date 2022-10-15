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
		System.setProperty("webdriver.chrome.driver", "C:/sarva/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:9090/sample/");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(
				"-------- " + driver.findElement(By.xpath("//h1[normalize-space()='CEO: Bala Shanmugham']")).getText());

		// //h1[normalize-space()='CEO: Bala Shanmugham']
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='CEO: Bala Shanmugham']")).getText()
				.contains("CEO: Bala Shanmugham"));

		driver.quit();

	}
}
