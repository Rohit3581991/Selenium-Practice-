package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newwayopenbrowser {
static WebDriver driver;
	public static void main(String[] args) {
		setUp("chrome");
		driver.get("http://www.google.com");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource.length());
		//System.out.println(pageSource);
		System.out.println("current page title: "+driver.getTitle());
		System.out.println("current page url: "+driver.getCurrentUrl());
		//driver.close();
		
		//setUp("firefox");
	}
	public static void setUp(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		     driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
	}
	 

}
