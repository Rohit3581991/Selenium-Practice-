package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Socialsiteopen {
	static WebDriver driver;

	public static void main(String[] args) {
		setUp("chrome");
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle.equals(expectedTitle));
		String pageSource = driver.getPageSource();
		System.out.println(pageSource.length());
		// System.out.println(pageSource);
		System.out.println("current page title: " + driver.getTitle());
		System.out.println("current page url: " + driver.getCurrentUrl());
		driver.close();
	}

	public static void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
