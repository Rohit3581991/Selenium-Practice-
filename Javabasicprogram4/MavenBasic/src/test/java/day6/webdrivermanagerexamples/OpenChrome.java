package day6.webdrivermanagerexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {
	static WebDriver driver;

	public static void main(String[] args) {
		//with the help of WebDriverManager call the respective browser method with required version and do the setup
		//WebDriverManager.chromedriver().version("110.0.5481.77").setup();
				//or
		//with the help of WebDriverManager call the respective browser method with automatic version based on your system and do the setup
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// enter the required URL
		driver.get("https://www.google.com");
	}
}
