package com.gcr.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.lala.Config.StartBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogin {//extends StartBrowser{
	static WebDriver driver;
	

	
	@Test
	//public void login() {/*
						//*/

//public void beforeClass() {*/
		public static void main (String[]args) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://id.heroku.com/login");
}

}
