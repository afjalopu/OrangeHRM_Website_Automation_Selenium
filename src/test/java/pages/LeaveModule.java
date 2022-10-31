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

public class LeaveModule extends CommonMethods {

	ExtentTest test;

	public LeaveModule(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindAll({ @FindBy(xpath = "//input[@placeholder=\"Search\"]") })
	WebElement SearchInputField;

	@FindAll({ @FindBy(xpath = "//a[@href=\"/web/index.php/leave/viewLeaveModule\"]") })
	WebElement LeaveModule;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-icon-button oxd-main-menu-button\"]") })
	WebElement OxdButton;

	@FindAll({ @FindBy(xpath = "(//nav[@class=\"oxd-topbar-body-nav\"]//ul//li)[3]") })
	WebElement EntitlementSection;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Add Entitlements')]") })
	WebElement AddEntitlementClick;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-autocomplete-wrapper\"]//input") })
	WebElement EmployeeNameInput;

	@FindAll({ @FindBy(xpath = "//span[contains(text(),'Adalwin')]") })
	WebElement SelectEmployeeName;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[1]") })
	WebElement LeaveTypeDropDownClick;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[2]") })
	WebElement LeavePeriodDropDownClick;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[4]//span") })
	WebElement DateForLeavePeriodDropDown;

	@FindAll({
			@FindBy(xpath = "((//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[6]//div)[2]//input") })
	WebElement EntitlementQuantity;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") })
	WebElement SaveButton;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-button-margin\"]") })
	WebElement ConfirmButton;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-radio-wrapper\"])[2]//label//span") })
	WebElement MultipleEmployeeRadioButton;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]") })
	WebElement AddButton;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[3]//div//div[@class=\"oxd-select-text-input\"]") })
	WebElement MultipleEmployeeLeaveTypeDropDown;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[4]//div//div[@class=\"oxd-select-text-input\"]") })
	WebElement MultipleEmployeeLeavePeriodDropDown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[7]//div[2]//input") })
	WebElement MultipleEmployeeEntitlement;

	@FindAll({
			@FindBy(xpath = "(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[2]") })
	WebElement MultipleEmployeeConfirmButton;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-autocomplete-wrapper\"]//div//input") })
	WebElement AfterMutipleEmployeeNameGiving;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") })
	WebElement SearchButton;

	@FindAll({ @FindBy(xpath = "(//nav[@class=\"oxd-topbar-body-nav\"]//ul//li)[1]") })
	WebElement ApplyButton;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[1]//div[@class=\"oxd-select-text-input\"]") })
	WebElement ApplySectionLeaveTypeDropdown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]//span") })
	WebElement ApplySectionLeaveTypeSelect;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-date-input\"])[1]//input") })
	WebElement FromDate;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-date-input\"])[2]//input") })
	WebElement ToDate;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[2]") })
	WebElement PartialDays;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]") })
	WebElement AllDays;

	@FindAll({ @FindBy(xpath = "((//div[@class=\"oxd-select-wrapper\"])[3]//div)[2]") })
	WebElement Durations;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]") })
	WebElement HalfDaysMorning;

	@FindAll({
			@FindBy(xpath = "((//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[6]//div)[2]//textarea") })
	WebElement TextArea;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") })
	WebElement applyButton;

	@FindAll({ @FindBy(xpath = "(//nav[@class=\"oxd-topbar-body-nav\"]//ul//li)[2]//a") })
	WebElement MyLeaveButton;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Assign Leave')]") })
	WebElement AssignLeaveButton;

	@FindAll({
			@FindBy(xpath = "((//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[1]//div)[2]//input") })
	WebElement AssignLeaveEmployeeName;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-autocomplete-dropdown --positon-bottom\"]//div)[1]//span") })
	WebElement AssignLeaveEmployeeNameSelect;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"]//div)[2]") })
	WebElement SingleEmployeeLeaveTypeDropdown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-option\"])[2]//span") })
	WebElement SingleEmployeeLeaveTypeSelect;

	@FindAll({
			@FindBy(xpath = "//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]") })
	WebElement TextAreaForEmployee;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Leave List')]") })
	WebElement LeaveList;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-table-body\"]") })
	WebElement TableBody;

	public void LeaveModuleClick() throws IOException {
		test.info("Leave Module Testing");
		try {
			if (SearchInputField.isDisplayed()) {

				SearchInputField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				timeOut();
				sendText(SearchInputField, "Leave");
				timeOut();
				timeOut();

				LeaveModule.click();
				timeOut();

				OxdButton.click();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Leave Module Click Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Leave Module Click Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(SearchInputField.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void EntitlementForMultipleEmployee() throws IOException {
		test.info("Entitlement Navbar");
		try {
			if (EntitlementSection.isDisplayed()) {

				EntitlementSection.click();
				timeOut();

				AddEntitlementClick.click();
				timeOut();
				timeOut();

				MultipleEmployeeRadioButton.click();
				timeOut();
				timeOut();

				MultipleEmployeeLeaveTypeDropDown.click();
				timeOut();
				ChooseLeaveTypeDropdown("CAN - Bereavement");
				timeOut();

				MultipleEmployeeLeavePeriodDropDown.click();
				timeOut();
				DateForLeavePeriodDropDown.click();
				timeOut();

				MultipleEmployeeEntitlement.click();
				timeOut();
				sendText(MultipleEmployeeEntitlement, "100");
				timeOut();

				SaveButton.click();
				timeOut();
				timeOut();

				MultipleEmployeeConfirmButton.click();
				timeOut();
				timeOut();

				sendText(EmployeeNameInput, "Odis");
				timeOut();
				SelectEmployeeName.click();
				timeOut();

				SearchButton.click();
				timeOut();
				timeOut();

				scrollPageDown();
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Leave Module Click Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Leave Module Click Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(EntitlementSection.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void AdminApplyForLeave() throws IOException {
		test.info("Apply Section");
		try {
			if (ApplyButton.isDisplayed()) {

				ApplyButton.click();
				timeOut();
				timeOut();

				ApplySectionLeaveTypeDropdown.click();
				timeOut();
				ApplySectionLeaveTypeSelect.click();
				timeOut();
				timeOut();

				FromDate("2023", "February", "21");
				timeOut();
				timeOut();
				ToDate("2023", "March", "21");
				timeOut();
				timeOut();

				PartialDays.click();
				timeOut();
				AllDays.click();
				timeOut();

				Durations.click();
				timeOut();
				HalfDaysMorning.click();
				timeOut();

				TextArea.sendKeys(Keys.chord(Keys.CONTROL, "", Keys.DELETE));
				sendText(TextArea, "Feeling Some Weakness(From Admin)");

				scrollToElement(applyButton);
				timeOut();

				applyButton.click();
				timeOut();
				timeOut();

				MyLeaveButton.click();
				timeOut();
				timeOut();

				scrollPageDown();
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Apply Section Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Leave Module Click Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ApplyButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void AssignleaveSection() throws IOException {
		test.info("Assign Leave Section");
		try {
			if (AssignLeaveButton.isDisplayed()) {

				AssignLeaveButton.click();
				timeOut();
				timeOut();

				AssignLeaveEmployeeName.sendKeys(Keys.chord(Keys.CONTROL, "", Keys.DELETE));
				sendText(AssignLeaveEmployeeName, "Peter");
//				AssignLeaveEmployeeName.click();
//				timeOut();
//				sendText(AssignLeaveEmployeeName, "Peter");
				timeOut();
				timeOut();
				AssignLeaveEmployeeNameSelect.click();
				timeOut();

				SingleEmployeeLeaveTypeDropdown.click();
				timeOut();
				SingleEmployeeLeaveTypeSelect.click();
				timeOut();

				FromDate("2023", "February", "2");
				timeOut();
				timeOut();
				ToDate("2023", "March", "1");
				timeOut();
				timeOut();

				PartialDays.click();
				timeOut();
				AllDays.click();
				timeOut();

				Durations.click();
				timeOut();
				HalfDaysMorning.click();
				timeOut();

				timeOut();
				sendText(TextAreaForEmployee, "Feeling Some Weakness(From Employee)");
				timeOut();

				scrollToElement(applyButton);
				timeOut();

				applyButton.click();
				timeOut();
				timeOut();

				LeaveList.click();
				timeOut();
				timeOut();

				scrollToElement(TableBody);
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Assign Leave Section Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Leave Module Click Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AssignLeaveButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void EntitlementForIndividualEmployee() throws IOException {
		test.info("Entitlement Navbar");
		try {
			if (EntitlementSection.isDisplayed()) {

				EntitlementSection.click();
				timeOut();
				timeOut();

				AddEntitlementClick.click();
				timeOut();
				timeOut();

				timeOut();
				sendText(EmployeeNameInput, "Odis");
				timeOut();
				SelectEmployeeName.click();
				timeOut();

				LeaveTypeDropDownClick.click();
				timeOut();
				ChooseLeaveTypeDropdown("CAN - Bereavement");
				timeOut();

				LeavePeriodDropDownClick.click();
				timeOut();
				DateForLeavePeriodDropDown.click();
				timeOut();

				sendText(EntitlementQuantity, "100");
				timeOut();

				SaveButton.click();
				timeOut();
				timeOut();

				ConfirmButton.click();
				timeOut();
				timeOut();

				scrollPageDown();
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Leave Module Click Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Leave Module Click Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LeaveModuleClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LeaveModuleClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(EntitlementSection.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

}
