package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberrunner.AbstractMain;

public class HomePage extends AbstractMain {

	public void setHomePage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shruthi Keerthi\\Documents\\automation\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tuclothing.sainsburys.co.uk/");
	}

	public void validSearch() {
		driver.findElement(By.cssSelector("#search")).sendKeys("bags");
	}

	public void selectSearchButton() {
		driver.findElement(By.cssSelector(".searchButton")).click();
	}
}
