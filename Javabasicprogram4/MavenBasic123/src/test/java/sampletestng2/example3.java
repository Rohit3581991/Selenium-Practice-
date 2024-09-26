package sampletestng2;

import org.testng.annotations.Test;

public class example3 {
	@Test(priority = 1)
	public void composemail() {
		System.out.println("compose mail");
	}

	@Test(priority = 2)
	public void checksentitems() {
		System.out.println("checksentitems");
	}

	@Test(enabled = true, description = "here user sign before login ")
	public void signin() {
		System.out.println("signin");
	}

	@Test(enabled = true, invocationCount = 5)
	public void login() {
		System.out.println("login");
	}

@Test(timeOut=2000)
public void compose() throws InterruptedException {
	System.out.println("started");
	Thread.sleep(1500);
	System.out.println("ends");
	
}
}
