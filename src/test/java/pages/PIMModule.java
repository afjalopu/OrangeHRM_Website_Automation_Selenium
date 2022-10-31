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

public class PIMModule extends CommonMethods {

	ExtentTest test;

	public PIMModule(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindAll({ @FindBy(xpath = "//input[@placeholder=\"Search\"]") })
	WebElement SearchInputField;

	@FindAll({ @FindBy(xpath = "//a[@href=\"/web/index.php/pim/viewPimModule\"]") })
	WebElement PIMModule;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-icon-button oxd-main-menu-button\"]") })
	WebElement OxdButton;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]") })
	WebElement clickOnAddButton;

	@FindAll({ @FindBy(xpath = "//input[@name=\"firstName\"]") })
	WebElement FirstName;

	@FindAll({ @FindBy(xpath = "//input[@name=\"middleName\"]") })
	WebElement MiddleName;

	@FindAll({ @FindBy(xpath = "//input[@name=\"lastName\"]") })
	WebElement LastName;

	@FindAll({ @FindBy(xpath = "class=\"oxd-file-input\"") })
	WebElement ImageUpload;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-switch-wrapper\"]") })
	WebElement CheckBox;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input)[5]") })
	WebElement EmployeeID;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[6]//input") })
	WebElement UserName;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[9]//input") })
	WebElement Password;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[10]//input") })
	WebElement ConfirmPassword;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") })
	WebElement SaveButton;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@class=\"oxd-input oxd-input--active\"])[1]") })
	WebElement NickName;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@class=\"oxd-input oxd-input--active\"])[3]") })
	WebElement OthersID;

	@FindAll({
			@FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//input[@class=\"oxd-input oxd-input--active\"])[4]") })
	WebElement DrivingLicenseNumber;

	@FindAll({ @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[7]") })
	WebElement SSNNumber;

	@FindAll({ @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[8]") })
	WebElement SINNumber;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[1]") })
	WebElement CountryListDiv;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[2]") })
	WebElement MaritalStatus;

	@FindAll({
			@FindBy(xpath = "(//span[@class=\"oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input\"])[1]") })
	WebElement MaleCheckBox;

	@FindAll({
			@FindBy(xpath = "(//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"])[1]") })
	WebElement PersonalDetailsSaveButton;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"])[16]//div[2]//input") })
	WebElement MilitaryService;

	@FindAll({
			@FindBy(xpath = "(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"])[1]") })
	WebElement SmokerCheckBox;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[3]") })
	WebElement BloodGroupDropDown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-form-actions\"])[2]//button") })
	WebElement BloodGroupSaveButton;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"]") })
	WebElement AttachmentButton;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Employee List')]") })
	WebElement EmployeeListButton;

	@FindAll({ @FindBy(xpath = "//div[contains(text(),'Md Afjal Sharif')]") })
	WebElement MdAfjalSharifOpuDiv;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-autocomplete-wrapper\"])[1]//input") })
	WebElement EmployeeNameSearchField;

	@FindAll({ @FindBy(xpath = "//span[contains(text(),'Md Afjal Sharif Opu')]") })
	WebElement MdAfjalSharifOpuDropDownName;

	@FindAll({
			@FindBy(xpath = "// button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") })
	WebElement SearchButtonClick;

	@FindAll({ @FindBy(xpath = "(//button[@class=\"oxd-icon-button oxd-table-cell-action-space\"])[1]") })
	WebElement DeleteButton;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin\"]") })
	WebElement DeleteDeclineButton;

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Reports')]") })
	WebElement ReportButton;

	@FindAll({ @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]") })
	WebElement ReportAddButton;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div)[2]//input") })
	WebElement ReportName;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-text-input\"])[1]") })
	WebElement ReportSelectionDropDown;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-autocomplete-wrapper\"]//input") })
	WebElement SelectionCritiriaEmployeeNameInputDiv;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-autocomplete-option\"]//span") })
	WebElement SelectionCritiriaEmployeeNameInputDropDown;

	@FindAll({ @FindBy(xpath = "(//button[@class=\"oxd-icon-button orangehrm-report-icon\"])[1]") })
	WebElement SelectionCritiriaPlusButton;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[2]//div") })
	WebElement IncludeDropDown;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"oxd-select-wrapper\"])[3]//div//div") })
	WebElement DisplayFieldGroup;

	@FindAll({ @FindBy(xpath = "((//div[@class=\"oxd-select-wrapper\"])[3]//div//div)[2]") })
	WebElement SelectDisplayField;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-switch-wrapper\"]//span") })
	WebElement IncludeHeaderCheckBox;

	@FindAll({ @FindBy(xpath = "(//button[@class=\"oxd-icon-button orangehrm-report-icon\"])[2]") })
	WebElement DisplayFieldPlusButton;

	@FindAll({
			@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") })
	WebElement ReportSaveButton;

	@FindAll({ @FindBy(xpath = "//ul//li[@class=\"oxd-userdropdown\"]//span[@class=\"oxd-userdropdown-tab\"]") })
	WebElement UserProfileButton;

	@FindAll({ @FindBy(xpath = "(//ul[@class=\"oxd-dropdown-menu\"]//li)[4]") })
	WebElement LogOutButton;

	@FindAll({ @FindBy(xpath = "//input[@name=\"username\"]") })
	WebElement NewUserName;

	@FindAll({ @FindBy(xpath = "//input[@name=\"password\"]") })
	WebElement NewPassword;

	@FindAll({ @FindBy(xpath = "//div[@class=\"oxd-form-actions orangehrm-login-action\"]") })
	WebElement NewLogIn;

	@FindAll({ @FindBy(xpath = "(//div[@class=\"rgHeaderCell\"])[10]") })
	WebElement EndingScrollBar;

	public void PIMModuleClick() throws IOException {
		test.info("PIM Module Testing");
		try {
			if (SearchInputField.isDisplayed()) {
				SearchInputField.click();

				sendText(SearchInputField, "PIM");
				timeOut();

				PIMModule.click();
				timeOut();

				OxdButton.click();
				timeOut();

				clickOnAddButton.click();
				timeOut();

				OxdButton.click();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>PIM Module Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PIMModuleClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PIMModuleClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>PIM Module Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PIMModuleClickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PIMModuleClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(SearchInputField.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void NameGiving() throws IOException {
		test.info("Name Giving");
		try {
			if (FirstName.isDisplayed()) {

				sendText(FirstName, "Md Afjal");
				timeOut();

				sendText(MiddleName, "Sharif");
				timeOut();

				sendText(LastName, "Opu");
				timeOut();

				CheckBox.click();
				timeOut();

				EmployeeID.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				sendText(EmployeeID, "244113123");

				test.pass("<p style=\"color:green; font-size:13px\"><b>Name Giving Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NameGivingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NameGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

				UserName.click();
				timeOut();
				sendText(UserName, "mdafjalsharifopu123");
				timeOut();

				Password.click();
				timeOut();
				sendText(Password, "aaAA@@11");
				timeOut();

				ConfirmPassword.click();
				timeOut();
				sendText(ConfirmPassword, "aaAA@@11");
				timeOut();
				timeOut();

				scrollToElement(SaveButton);
				timeOut();

				SaveButton.click();
				timeOut();
				timeOut();
				timeOut();

				test.pass("<p style=\"color:green; font-size:13px\"><b>Name And Password Giving Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath2 = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NamePasswordGivingPass");
				String dest2 = System.getProperty("user.dir") + "\\screenshots\\" + "NamePasswordGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest2).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Name Giving Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NamePasswordGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NamePasswordGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(FirstName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void NickNameOtherIDDrivingLicenseGiving() throws IOException {
		test.info("NickName To License Info Giving");
		try {
			if (NickName.isDisplayed()) {

				Thread.sleep(3000);
				NickName.click();
				Thread.sleep(5000);
				sendText(NickName, firstNameGenerate());
				timeOut();

				OthersID.click();
				sendText(OthersID, phoneNumberGenerate());
				timeOut();

				DrivingLicenseNumber.click();
				sendText(DrivingLicenseNumber, phoneNumberGenerate());
				timeOut();

				DatePickerFunction("2025", "April", "16");
				Thread.sleep(5000);

				SSNNumber.click();
				sendText(SSNNumber, phoneNumberGenerate());
				timeOut();

				SINNumber.click();
				sendText(SINNumber, phoneNumberGenerate());
				timeOut();

				CountryListDiv.click();
				timeOut();
				ChoosenCountryFromList("Turkish");
				timeOut();

				MaritalStatus.click();
				timeOut();
				ChoosenMartialStatus("Married");
				timeOut();

				DOBDatePicker("2026", "April", "14");
				Thread.sleep(5000);

				MaleCheckBox.click();
				timeOut();
				timeOut();

				MilitaryService.click();
				sendText(MilitaryService, "Lieutenant Colonel");
				timeOut();

				SmokerCheckBox.click();
				timeOut();

				BloodGroupDropDown.click();
				timeOut();
				ChoosenBloodGroup("AB+");
				timeOut();

				BloodGroupSaveButton.click();
				timeOut(5000);

				PersonalDetailsSaveButton.click();
				timeOut(5000);

				EmployeeListButton.click();
				timeOut(5000);

				sendText(EmployeeNameSearchField, "Md");
				timeOut();
				timeOut(5000);

				MdAfjalSharifOpuDropDownName.click();
				timeOut();
				timeOut();

				SearchButtonClick.click();
				timeOut();
				timeOut();

				scrollPageDown();
				timeOut();
				timeOut();

				DeleteButton.click();
				timeOut();

				DeleteDeclineButton.click();
				timeOut();
				timeOut();

				timeOut();
				ReportButton.click();
				timeOut();

				ReportAddButton.click();
				timeOut();
				timeOut();

				ReportName.sendKeys(Keys.chord(Keys.CONTROL, "", Keys.DELETE));
				sendText(ReportName, "Employee Information123");
				timeOut();

				ReportSelectionDropDown.click();
				timeOut();
				ChoosenSelectionCritiria("Employee Name");
				timeOut();

				SelectionCritiriaPlusButton.click();
				timeOut();
				timeOut();

				SelectionCritiriaEmployeeNameInputDiv.click();
				timeOut();
				sendText(SelectionCritiriaEmployeeNameInputDiv, "Md Afjal");
				timeOut();

				ChoosenSelectionDropDownEmployeeName("Md Afjal Sharif Opu");
				timeOut();
				timeOut();

				IncludeDropDown.click();
				timeOut();
				ChoosenFromIncludeDropDown("Current and Past Employees");
				timeOut();

				DisplayFieldGroup.click();
				timeOut();
				ChoosenDisplayFieldDropDown("Personal");
				timeOut();

				DisplayFieldPlusButton.click();
				timeOut();
				timeOut();

				IncludeHeaderCheckBox.click();
				timeOut();
				timeOut();

				scrollPageDown();
				timeOut();

				ReportSaveButton.click();
				timeOut();
				timeOut();
				timeOut();
				timeOut();

				HorizontalScroll(EndingScrollBar);
				timeOut(5000);

				test.pass("<p style=\"color:green; font-size:13px\"><b>NickName to License Giving Success</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath2 = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"NickNameToLicenseGivingPass");
				String dest2 = System.getProperty("user.dir") + "\\screenshots\\" + "NickNameToLicenseGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest2).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>NickName to License GIving Fail</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NickNameToLicenseGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NickNameToLicenseGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(NickName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

}
