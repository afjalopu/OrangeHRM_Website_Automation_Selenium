package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
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

public class AdminModule extends CommonMethods {

	ExtentTest test;

	public AdminModule(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindAll({ @FindBy(xpath = "//input[@placeholder=\"Search\"]") })
	WebElement SearchInputField;

	@FindAll({ @FindBy(xpath = "//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]") })
	WebElement AdminButton;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-icon-button oxd-main-menu-button\"]") })
	WebElement OxdButton;

	@FindAll({
			@FindBy(xpath = "//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@class=\"oxd-input oxd-input--active\"]") })
	WebElement SysUserName;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]") })
	WebElement SysFirstDropDown;

	@FindAll({ @FindBy(xpath = "//i[@class=\"oxd-icon bi-caret-up-fill\"]") })
	WebElement UpArrowClick;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]") })
	WebElement clickOnAddButton;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]") })
	WebElement UserRoleDropDown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]") })
	WebElement SelectAdmin;

	@FindAll({
			@FindBy(xpath = "//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]//input") })
	WebElement EmployeeName;

	@FindAll({ @FindBy(xpath = "((//div[@class=\"oxd-select-wrapper\"])[2]//div)[2]") })
	WebElement StatusDropDown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]") })
	WebElement EnableOption;

	@FindAll({
			@FindBy(xpath = "((//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[4]//div)[2]//input") })
	WebElement UserName;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@type=\"password\"])[1]") })
	WebElement Password;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@type=\"password\"])[2]") })
	WebElement ConfirmPassword;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-form-actions\"]//button)[2]") })
	WebElement SaveButton;

	@FindAll({ @FindBy(xpath = "class=\"oxd-autocomplete-dropdown --positon-bottom\"") })
	WebElement EmployeeList;

	public void Admin() throws IOException {
		test.info("Admin Modulse Testing");
		try {
			if (SearchInputField.isDisplayed()) {
				SearchInputField.click();
				sendText(SearchInputField, "Admin");
				timeOut();
				AdminButton.click();
				timeOut();
				OxdButton.click();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Admin Module Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AdminModuleTestingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AdminModuleTestingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Admin Module Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AdminModuleTestingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AdminModuleTestingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(SearchInputField.isDisplayed());
			Assert.assertTrue(AdminButton.isDisplayed());
			Assert.assertTrue(OxdButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void UpArrowClick() throws IOException {
		test.info("Click On Up Arrow Button");
		try {
			if (UpArrowClick.isDisplayed()) {
				UpArrowClick.click();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Up Arrow Clicked Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UpArrowClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UpArrowClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Up Arrow Clicked Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UpArrowClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UpArrowClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UpArrowClick.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnAddButton() throws IOException {
		test.info("Click On Add Button");
		try {
			if (clickOnAddButton.isDisplayed()) {
				clickOnAddButton.click();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Click on Add Button Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnAddButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnAddButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Up Arrow Clicked Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnAddButtonFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnAddButtonFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(clickOnAddButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void UserRoleDropDown() throws IOException {
		test.info("Click On UserRole DropDown");
		try {
			if (UserRoleDropDown.isDisplayed()) {
				UserRoleDropDown.click();
				timeOut(3000);

				SelectAdmin.click();
				timeOut(3000);

				test.pass("<p style=\"color:green; font-size:13px\"><b>Click on UserRole DropDown Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ClickOnUserRoleDropDownPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnUserRoleDropDownPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>User Role Dropdown Clicked Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnUserRoleDropDownFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnUserRoleDropDownFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UserRoleDropDown.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void EmployeeNameGiving() throws IOException {
		test.info("Employee Name Giving");
		try {
			if (EmployeeName.isDisplayed()) {
				sendText(EmployeeName, "Linda");
				timeOut();
				timeOut();
				timeOut();
				timeOut();

				sendTextForDropDown("Linda Jane Anderson");
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>EmployeeName Given Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "EmployeeNameGivingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "EmployeeNameGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>User Name Given Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "EmployeeNameGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "EmployeeNameGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(EmployeeName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void StatusDropDown() throws IOException {
		test.info("Status DropDown Selection");
		try {
			if (StatusDropDown.isDisplayed()) {
				StatusDropDown.click();
				timeOut();

				EnableOption.click();
				timeOut();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Status DropDown Selection Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"StatusDropDownSelectPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "StatusDropDownSelectPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Status Dropdown Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "StatusDropDownSelectFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "StatusDropDownSelectFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(StatusDropDown.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void UserName() throws IOException {
		test.info("UserName Giving");
		try {
			if (UserName.isDisplayed()) {

				UserName.sendKeys(Keys.chord(Keys.CONTROL, "", Keys.DELETE));
				timeOut();
				sendText(UserName, "Md.Afjal.Sharif.Opu23");
				timeOut();
				timeOut();

				Password.click();
				timeOut();
				sendText(Password, "aaAA@@12");
				timeOut();

				ConfirmPassword.click();
				timeOut();
				sendText(ConfirmPassword, "aaAA@@12");
				timeOut();
				timeOut();

				SaveButton.click();
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>UserName Given Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNameGivenPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserNameGivenPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>UserName Given Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNameGivenFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserNameGivenFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UserName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}
}
