package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hi\\eclipse-workspace\\Vani\\JavaProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void type(WebElement e, String s) {
		e.sendKeys(s);
	}
	public static void clickBtn(WebElement e) {
		e.click();
	}
	public static void close() {
		driver.quit();
	}

}
