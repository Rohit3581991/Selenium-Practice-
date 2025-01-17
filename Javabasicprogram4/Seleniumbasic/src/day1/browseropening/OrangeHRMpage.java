package day1.browseropening;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMpage {
	static WebDriver driver;

	public static void main(String[] args) {
		setUp("chrome"); // chrome open function
		//url open 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // time managing function
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin"); // usename
		//by using xpath
		
		driver.findElement(By.name("password")).sendKeys("admin123"); // password
		driver.findElement(By.tagName("button")).click(); // login button
		FluentWait wait = new FluentWait(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		// WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));
		driver.findElement(By.tagName("a")).click(); // logout button
		//driver.close(); // closed browser
	}

	public static void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}