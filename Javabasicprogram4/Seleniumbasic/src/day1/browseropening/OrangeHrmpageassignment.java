package day1.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmpageassignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Username field check
		WebElement UsernameInputField=driver.findElement(By.className("oxd-input"));
		System.out.println("Username input field visible or not? " +UsernameInputField.isDisplayed());
		System.out.println("Username input field editable or not? " +UsernameInputField.isEnabled());
		String UsernameInputFieldValue=UsernameInputField.getAttribute("placeholder");
		System.out.println(" Default value validation status: "+UsernameInputField.equals("Username"));
		//Password field check
		WebElement PasswordInputField=driver.findElement(By.className("oxd-input"));
		System.out.println("Password input field visible or not? "+PasswordInputField.isDisplayed());
		System.out.println("Password input field editable or not? "+PasswordInputField.isEnabled());
		String PasswordInputFieldValue=PasswordInputField.getAttribute("placeholder");
		System.out.println("Default value validation status: "+PasswordInputField.equals("Password"));
		// login button field
		WebElement LoginInputField=driver.findElement(By.className("oxd-button"));
		System.out.println("Login input field visible or not? "+LoginInputField.isDisplayed());
		System.out.println("Login input field editable or not? "+LoginInputField.isEnabled());
		String LoginInputFieldValue=LoginInputField.getAttribute("type");
		System.out.println("Default value validation status: "+LoginInputField.equals("submit"));
		
		
	}

}
