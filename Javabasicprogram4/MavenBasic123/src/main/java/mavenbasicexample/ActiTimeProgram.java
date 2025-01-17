package mavenbasicexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtility;

public class ActiTimeProgram {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
	    String browser=prop.getProperty("browserName");
		String Url=prop.getProperty("appUrl");
		String expectedLoginPageTitle=prop.getProperty("expectedLoginPageTitle");
		String userName=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedHomePageTitle=prop.getProperty("expectedLoginPageTitle");
		SeleniumUtility.setUp(browser,Url);
		SeleniumUtility.driver.findElement(By.id("username")).sendKeys(userName);
		SeleniumUtility.driver.findElement(By.name("pwd")).sendKeys(password);
		SeleniumUtility.driver.findElement(By.id("loginButton")).click();
		SeleniumUtility.wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle=SeleniumUtility.driver.getTitle();
		System.out.println("Home page validation status: "+actualHomePageTitle.equals(expectedHomePageTitle));
		SeleniumUtility.driver.close();
		
	}
}


