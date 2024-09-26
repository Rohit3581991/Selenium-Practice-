package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
     // System.setProperty("webdriver.chrome.driver","E:\\workspace\\Javabasicprogram4\\Seleniumbasic\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
      ChromeDriver cdriver=new ChromeDriver();
	}

}
