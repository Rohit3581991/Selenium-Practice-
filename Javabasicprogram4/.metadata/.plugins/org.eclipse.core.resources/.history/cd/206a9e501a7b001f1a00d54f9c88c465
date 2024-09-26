package day6.webdriverwithpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtility;

public class ActitimeLoginLogout2 {

	public static void main(String[] args){
		//load required property file
		SeleniumUtility.loadPropertyFile(".\\src\\test\\resources\\testData\\AppData.properties");
		//get data from property file
		String browser=SeleniumUtility.getDataFromPropertyFile("browserName");
		String url=SeleniumUtility.getDataFromPropertyFile("appUrl");
		String exp_HomePageTitle=SeleniumUtility.getDataFromPropertyFile("expectedHomePageTitle");
		
		SeleniumUtility.setUp(browser,url);
		SeleniumUtility.driver.findElement(By.id("username")).sendKeys(SeleniumUtility.getDataFromPropertyFile("username"));
		SeleniumUtility.driver.findElement(By.name("pwd")).sendKeys(SeleniumUtility.getDataFromPropertyFile("password"));
		SeleniumUtility.driver.findElement(By.id("loginButton")).click();
		
		//SeleniumUtility.wait.until(ExpectedConditions.titleIs(exp_HomePageTitle));
				//or
		SeleniumUtility.waitUntilPageTitleMatched(exp_HomePageTitle);
		String act_HomePageTitle=SeleniumUtility.driver.getTitle();
		System.out.println("Home page validation status: "+act_HomePageTitle.equals(exp_HomePageTitle));
		
		SeleniumUtility.driver.close();
	}
}
