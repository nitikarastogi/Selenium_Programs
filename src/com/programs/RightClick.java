package com.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class RightClick {

	public static void main(String[] args) throws Exception {

		try {
			SoftAssert soft = new SoftAssert();

			WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.get("https://unilogcorp.com");

			soft.assertTrue(driver.getTitle().contains("Unilog"),
					"Invalid Title: actual title value is :" + driver.getTitle());

			System.out.println(driver.getTitle());

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Actions RClick = new Actions(driver);

			RClick.contextClick(driver.findElement(By.linkText("CONTACT"))).sendKeys(Keys.ARROW_DOWN).click().build()
					.perform();

			Thread.sleep(10000);

			driver.close();

			System.out.println("Soft Assert Successful");

			soft.assertAll();
		} catch (AssertionError e) {

			e.getMessage();
		}

	}

}
