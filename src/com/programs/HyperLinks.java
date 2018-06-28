package com.programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HyperLinks {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://unilogcorp.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Number of hyper links.
		System.out.println(links.size());

		// Name of the HyperLinks
		for (WebElement webElement : links) {
			System.out.println(webElement.getText());
		}

	}

}
