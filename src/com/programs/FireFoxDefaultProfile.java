package com.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FireFoxDefaultProfile {

	public static void main(String[] args) throws Exception {
		
		ProfilesIni init=new ProfilesIni();
		 
		FirefoxProfile profile=init.getProfile("default");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("https://unilogcorp.com");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
	
}
