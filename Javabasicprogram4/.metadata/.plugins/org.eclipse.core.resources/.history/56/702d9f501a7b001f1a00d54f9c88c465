package day7.cssvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class ActitimeErrorMsgValidation {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		//click on login button
		SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
		//Explicti wait
		SeleniumUtility.waitUntilTextToBeMatched(By.cssSelector(".errormsg"), "Username or Password is invalid. Please try again.");
		//identify error msg
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		/**
		 * validation-
		 * 			error msg color: red
		 * 			font size: 13px
		 */
		String errorColorInRGBA=errorMsg.getCssValue("color");
		String errorFontSize=errorMsg.getCssValue("font-size");
		System.out.println("Error Msg Color code: "+errorColorInRGBA);
		System.out.println("Error Msg Font size: "+errorFontSize);
	}

}
