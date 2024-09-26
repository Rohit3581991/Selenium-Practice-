package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browservalidationpage {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http:www.amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().forward();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		driver.navigate().to("");
		https://www.google.com

	}
	public static void setUp(String browserName,String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
}
}