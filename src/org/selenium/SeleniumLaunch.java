package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumLaunch extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("https://www.facebook.com/");
		maximize();
		WebElement e = driver.findElement(By.id("email"));
		type(e, "Kalai");
		WebElement p = driver.findElement(By.id("pass"));
		type(p, "Vani");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		clickBtn(btn);
		close();
	}
}
