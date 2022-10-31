package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class HomePage extends CommonMethods {

	ExtentTest test;

	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindAll({ @FindBy(xpath = "//input[@name=\"username\"]") })
	WebElement UserName;

	@FindAll({ @FindBy(xpath = "//input[@name=\"password\"]") })
	WebElement Password;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-form-actions orangehrm-login-action\"]") })
	WebElement LogIn;

	public void SignIn() throws IOException {
		test.info("Giving UserName and Password");
		try {
			if (UserName.isDisplayed()) {
				UserName.click();
				timeOut();
				sendText(UserName, "Admin");
				timeOut();
				sendText(Password, "admin123");
				timeOut(3000);
				LogIn.click();

				test.pass("<p style=\"color:green; font-size:13px\"><b>LogIn Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LogInSuccessPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LogInSuccessPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>LogIn Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LogInFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LogInFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UserName.isDisplayed());
			Assert.assertTrue(Password.isDisplayed());
			Assert.assertTrue(LogIn.isDisplayed());

			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

}
