package day1.browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
	      FirefoxDriver cdriver=new FirefoxDriver();
	}

}
