package day1.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplecssselector {
static WebDriver driver;
	public static void main(String[] args) {
		setUp("chrome");
		driver.get("https://online.actitime.com/rsahare/login.do");
		String userName=driver.findElement(By.cssSelector("#textFieldsTable>tbody>tr:nth-of-type(1)>*:last-child")).getText().replace("Username: ", "");
		String[]pwd=driver.findElement(By.cssSelector("#textFieldsTable>tbody>tr:nth-of-type(2)>*:last-child")).getText().split(" ");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys("D$4EruW6");
		driver.findElement(By.id("loginButton")).click();
		
		
	}
	public static void setUp(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		     driver=new ChromeDriver();
}
	}
}