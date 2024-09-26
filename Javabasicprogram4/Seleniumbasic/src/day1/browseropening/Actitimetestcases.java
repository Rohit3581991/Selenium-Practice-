package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimetestcases {
	static WebDriver driver;

	public static void main(String[] args) {
		// step1 open chrome browser
		setUp("chrome");
		// step2 enter application url
		driver.get("https://online.actitime.com/rsahare/login.do");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        // step3 enter username
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rohitsahare9@gmail.com");
		// step4 enter password
		driver.findElement(By.name("pwd")).sendKeys("D$4EruW6");
		// step5 enter login page
		driver.findElement(By.id("loginButton")).click();
		// Step6 validate home page
		WebDriverWait wait= new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		String expectedTitle="actiTIME - Login";
	    String actualTitle = driver.getTitle();
		System.out.println("Expected title is:" + expectedTitle);
		System.out.println("actual title is:" + actualTitle);
		System.out.println("home page title validation satus: " +actualTitle.equals(expectedTitle));
		// step7 logout page
	    driver.findElement(By.id("logoutLink")).click();
		// step8 close the browser
	   driver.close();
	   
	}

	public static void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}

	}
}