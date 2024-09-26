package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimepageopening {
	static WebDriver driver;
	public static void main(String[] args) {
			setUp("chrome");
			driver.get("http://demo.actitime.com");
			String pageSource=driver.getPageSource();
			System.out.println(pageSource.length());
			//System.out.println(pageSource);
			System.out.println("current page title: "+driver.getTitle());
			System.out.println("current page url: "+driver.getCurrentUrl());
			//driver.close();

}
		public static void setUp(String browserName) {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
			     driver=new ChromeDriver();
			}
		}
	}
			     
			     
			     
			     