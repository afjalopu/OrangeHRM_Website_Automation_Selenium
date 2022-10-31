
package utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import drivers.PageDriver;

public class CommonMethods {

	/************************
	 * Getting Email And Password Page URL *
	 ************************
	 */
	public void SendText(WebElement element, String Value) {
		element.clear();
		element.sendKeys(Value);
	}

	/************************
	 * Get Current Page URL *
	 ************************
	 */

	public String currentPageUrl() {
		return PageDriver.getCurrentDriver().getCurrentUrl();
	}

	/**************************
	 * Get Current Page Title *
	 **************************
	 */

	public String getTitle() {
		return PageDriver.getCurrentDriver().getTitle();
	}

	/************************************************************
	 * Write in a input field *
	 * 
	 * @param element This is the target element where to write *
	 * @param value   what to write *
	 ************************************************************
	 */

	public void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	/****************************************************************************
	 * Perform Hover on an element *
	 * 
	 * @param element This is the target element where to perform hover action *
	 ****************************************************************************
	 */

	public void hover(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.clickAndHold(element).build().perform();
	}

	/****************************************************************************
	 * Clear Input Field *
	 * 
	 * @param element This is the target element where to perform hover action
	 * @throws InterruptedException *
	 ****************************************************************************
	 */

	public void ClearInput(WebElement element) throws InterruptedException {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		action.moveToElement(element).click();
	}

	/********************************************************************
	 * Handle shadow Dome Related Task *
	 * 
	 * @param host    is the root element shadow dome *
	 * @param element is the targeted element within the shadow dome *
	 ********************************************************************
	 */

	public void shadowDomePopup(WebElement host, By element) {
		// Finding the ShadowRoot in a WebElement
		SearchContext context = host.getShadowRoot();
		// finding the targeted element
		context.findElement(element).click();
	}

	/************************************************
	 * Handle Select Tag Related Element Task *
	 * 
	 * @param element locator of Select tag *
	 * @param value   attribute value of option tag *
	 ************************************************
	 */

	public void selectItemByValue(WebElement element, String value) {
		Select selectItems = new Select(element);
		selectItems.selectByValue(value);
	}

	public void selectItemByVisibleText(WebElement element, String value) {
		Select selectItems = new Select(element);
		selectItems.selectByVisibleText(value);
	}

	public void selectItemByIndex(WebElement element, int index) {
		Select selectItems = new Select(element);
		selectItems.selectByIndex(index);
	}

	/********************************************
	 * Get selected Item's Text *
	 ********************************************
	 */

	public String selectedItemText(WebElement element) {
		Select selectItems = new Select(element);
		return selectItems.getFirstSelectedOption().getText();
	}

	/************************************************************
	 * Get Items select status True if selected or false *
	 * **********************************************************
	 */

	public boolean itemSelectedStatus(List<WebElement> elements, String value) {
		for (WebElement element : elements) {
			if (element.getAttribute("value").equals(value)) {
				return element.isSelected();
			}
		}
		return false;
	}

	/*************************************
	 * Handle List elements Related Task *
	 *************************************
	 */

	// Perform any action on the nth number of elements from an elements list
	public void clickOnNthNumberButton(List<WebElement> elements, int position) {
		elements.get(position - 1).click();
	}

	// Perform click action on an element where visible Text matches from an element
	// list
	public void listitem(List<WebElement> elements, String visibleText) {
		for (WebElement element : elements) {
			if (element.getText().equals(visibleText)) {
				element.click();
				break;
			}
		}
	}

	/**********************************
	 * Handle JavaScript Related Task *
	 **********************************
	 */

	// click on a hidden element by using JavascriptExecutor
	public void clickOnAButtonJs(String script) {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript(script + ".click();");
	}

	// Set any DOM element Border color using JavascriptExecutor
	public void highlighter(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background: beige');", element);
	}

	/************************************************
	 * Scroll to an element *
	 * 
	 * @param element This is the target element *
	 ************************************************
	 */

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	/************************************************
	 * Scroll UP and DOWN *
	 ************************************************
	 */

	// scroll up a page
	public void scrollPageUp() {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		// action.sendKeys(Keys.PAGE_UP).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		timeOut();
	}

	// scroll down a page
	public void scrollPageDown() {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		// action.sendKeys(Keys.PAGE_DOWN).build().perform();
		timeOut();
	}

	/************************************************************************
	 * Scroll Within an element *
	 * 
	 * @param cssLocator is the target element's cssLocator/query selector *
	 * @param offsetX    is the scroll position relative to x axis *
	 * @param offsetY    is the scroll position relative to Y axis *
	 ************************************************************************
	 */

	public void scrollInsideElement(String cssLocator, int offsetX, int offsetY) {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("document.querySelector('" + cssLocator + "').scrollBy(" + offsetX + "," + offsetY + ");");
	}

	/****************************
	 * Handle Wait Related Task *
	 ****************************
	 */

	WebDriverWait wait;

	// wait for default set seconds
	public void timeOut() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// wait for customize given seconds
	public void timeOut(int durationMS) {
		try {
			Thread.sleep(durationMS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Wait for an alert present and return with an alert
	public Alert waitForAlert() {
		wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}

	// Wait for an element to be present
	public void waitForElement(By element) {
		wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public void waitUntilElementVisible(WebElement element) {
		wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/***********************************************
	 * Wait to completely load the current web page*
	 * *********************************************
	 */

	public void waitForPageLoad() {
		wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
		wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState;").equals("complete"));
	}

	/*****************************
	 * Handle Alert Related Task *
	 *****************************
	 */

	// Accept alert whenever it present
	public void alertAccept() {
		Alert alert = waitForAlert();
		alert.accept();
	}

	// Accept alert with giving text whenever it present
	public void allertAccept(String value) {
		Alert alert = waitForAlert();
		alert.sendKeys(value);
		alert.accept();
	}

	// Decline alert whenever it present
	public void alertDismiss() {
		Alert alert = waitForAlert();
		alert.dismiss();
	}

	/****************************
	 * Faker Related Task *
	 ****************************
	 */

	static Faker faker = new Faker(new Locale("en-US"));

	public static String email;

	public static String emailGenerate() {
		email = faker.bothify("????##@mail.com");
		return email;
	}

	public static String firstName;

	public static String firstNameGenerate() {
		firstName = faker.name().firstName().concat(faker.name().fullName());
		int StringLength = firstName.length();
		if (StringLength < 5 && StringLength > 30) {
			firstNameGenerate();
		}
		return firstName;
	}

	public static String lastName;

	public static String lastNameGenerate() {
		lastName = faker.name().lastName();
		return lastName;
	}

	public static String phoneNumber;

	public String phoneNumberGenerate() {
		phoneNumber = faker.numerify("###-###-####");
		return phoneNumber;
	}

	public static String Number;

	public String NumberGenerate() {
		Number = faker.numerify("########");
		return Number;
	}

	public static String password;

	public String passwordGenerate() {
		password = faker.animal().name();
		return password;
	}

	public static String Address;

	public String AddressGenerate() {
		Address = faker.address().fullAddress();
		return Address;
	}

	/************************************************************************************
	 * Perform Double Click on an element * *
	 * 
	 * @param element This is the target element where to perform double click
	 *                action *
	 ************************************************************************************
	 */

	public void doubleClick(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.doubleClick(element).build().perform();
	}

	/****************************
	 * Window Handling *
	 ****************************
	 */

	public List<String> windowHandling() {
		// Get all window handles and hold them in a list.
		Set<String> windowHandles = PageDriver.getCurrentDriver().getWindowHandles(); // driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(windowHandles);

		// Write to total window handle number to the console.
		@SuppressWarnings("unused")
		int size = windowHandlesList.size();
		System.out.println("Window Handles Size Is " + size);
		return windowHandlesList;
	}

	public void pageRefresh() {
		PageDriver.getCurrentDriver().navigate().refresh();
		timeOut();
	}

	public void newTabOpen() {
		PageDriver.getCurrentDriver().switchTo().newWindow(WindowType.TAB);
		System.out.println("Open a new Tab");
	}

	public void sendTextForDropDown(String value) {
		List<WebElement> AllData = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-autocomplete-option\"]//span"));
		timeOut();
		timeOut();

		for (WebElement singleData : AllData) {
			if (singleData.getText().equals(value)) {
				singleData.click();
				timeOut(10000);
			}
		}
	}

	/****************************
	 * Date Picker *
	 ****************************
	 */
	public void DatePickerFunction(String GivenYear, String GivenMonth, String GivenDate) {

		String Year = GivenYear;
		String Month = GivenMonth;
		String Date = GivenDate;

		PageDriver.getCurrentDriver().findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[5]"))
				.click(); // DateInputField

		while (true) {
			String TakenMonth = PageDriver.getCurrentDriver()
					.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]")).getText();
			String TakenYear = PageDriver.getCurrentDriver()
					.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[2]")).getText();
			// DateMonthOnDivTop
			String MonthValue = TakenMonth;
			String YearValue = TakenYear;

			if (MonthValue.equalsIgnoreCase(Month) && YearValue.equalsIgnoreCase(Year)) {
				break;
			} else {
				PageDriver.getCurrentDriver().findElement(By.xpath("(//button[@class=\"oxd-icon-button\"])[2]"))
						.click(); // NextArrowButton
			}
		}

		// Date Selection
		List<WebElement> AllDates = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-calendar-date\"]")); // InsideTableDate

		for (WebElement SingleDate : AllDates) {
			String DateValue = SingleDate.getText();
			if (DateValue.equalsIgnoreCase(Date)) {
				SingleDate.click();
				break;
			}
		}
	}

	public void ChoosenCountryFromList(String Value) throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> AllCountries = PageDriver.getCurrentDriver().findElements(
				By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//div[@class=\"oxd-select-option\"]"));

		Thread.sleep(3000);

		for (WebElement SingleCountry : AllCountries) {
			String CountryName = SingleCountry.getText();
			if (CountryName.equalsIgnoreCase(Value)) {
				SingleCountry.click();
				break;
			}
		}
	}

	public void ChoosenMartialStatus(String Value) throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> AllStatus = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-select-option\"]//span"));

		Thread.sleep(3000);

		for (WebElement SingleStatus : AllStatus) {
			String StatusName = SingleStatus.getText();
			if (StatusName.equalsIgnoreCase(Value)) {
				SingleStatus.click();
				break;
			}
		}
	}

	public void DOBDatePicker(String GivenYear, String GivenMonth, String GivenDate) {

		String Year = GivenYear;
		String Month = GivenMonth;
		String Date = GivenDate;

		PageDriver.getCurrentDriver().findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[9]"))
				.click(); // DateInputField

		while (true) {
			String TakenMonth = PageDriver.getCurrentDriver()
					.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]")).getText();
			String TakenYear = PageDriver.getCurrentDriver()
					.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[2]")).getText();
			// DateMonthOnDivTop
			String MonthValue = TakenMonth;
			String YearValue = TakenYear;

			if (MonthValue.equalsIgnoreCase(Month) && YearValue.equalsIgnoreCase(Year)) {
				break;
			} else {
				PageDriver.getCurrentDriver().findElement(By.xpath("(//button[@class=\"oxd-icon-button\"])[2]"))
						.click(); // NextArrowButton
			}
		}

		// Date Selection
		List<WebElement> AllDates = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-calendar-date\"]")); // InsideTableDate

		for (WebElement SingleDate : AllDates) {
			String DateValue = SingleDate.getText();
			if (DateValue.equalsIgnoreCase(Date)) {
				SingleDate.click();
				break;
			}
		}
	}

	public void ChoosenBloodGroup(String Value) throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> AllBloodGroup = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-select-option\"]//span"));

		Thread.sleep(3000);

		for (WebElement SingleBloodGroup : AllBloodGroup) {
			String BloodGroupName = SingleBloodGroup.getText();
			if (BloodGroupName.equalsIgnoreCase(Value)) {
				SingleBloodGroup.click();
				break;
			}
		}
	}

	public void ChoosenInfoName(String Value) throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> AllInfoDiv = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"]//div"));

		Thread.sleep(3000);

		for (WebElement SingleInfoDiv : AllInfoDiv) {
			String Info = SingleInfoDiv.getText();
			System.out.println(Info);
			if (Info.equalsIgnoreCase(Value)) {
				scrollToElement(SingleInfoDiv);
				Thread.sleep(7000);
				SingleInfoDiv.click();
			}
		}
	}

	public void ChoosenSelectionCritiria(String Value) throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> AllOptions = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-select-option\"]//span"));

		Thread.sleep(3000);

		for (WebElement SingleOption : AllOptions) {
			String OptionName = SingleOption.getText();
			if (OptionName.equalsIgnoreCase(Value)) {
				SingleOption.click();
				break;
			}
		}
	}

	public void SendReportNameText(WebElement ReportName, String Value) {
		ReportName.sendKeys(Value);
	}

	public void ChoosenSelectionDropDownEmployeeName(String Value) throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> AllDropDownName = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-autocomplete-option\"]//span"));

		Thread.sleep(3000);

		for (WebElement SingleDropDownName : AllDropDownName) {
			String Info = SingleDropDownName.getText();
			if (Info.equalsIgnoreCase(Value)) {
				SingleDropDownName.click();
				break;
			}
		}
	}

	public void ChoosenFromIncludeDropDown(String Value) throws InterruptedException {

		List<WebElement> AllInclude = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]//div//span"));

		Thread.sleep(2000);

		for (WebElement SingleInclude : AllInclude) {
			String Info = SingleInclude.getText();
			if (Info.equalsIgnoreCase(Value)) {
				SingleInclude.click();
				break;
			}
		}
	}

	public void ChoosenDisplayFieldDropDown(String Value) throws InterruptedException {

		List<WebElement> AllInclude = PageDriver.getCurrentDriver()
				.findElements(By.xpath("(//div[@class=\"oxd-select-option\"])[2]//span"));

		Thread.sleep(2000);

		for (WebElement SingleInclude : AllInclude) {
			String Info = SingleInclude.getText();
			if (Info.equalsIgnoreCase(Value)) {
				SingleInclude.click();
				break;
			}
		}
	}

//	public void CloseLastWindows() {
//		Set<String> windowHandles = PageDriver.getCurrentDriver().getWindowHandles(); // driver.getWindowHandles();
//		List<String> windowHandlesList = new ArrayList<>(windowHandles);
//
//		int TotalWindowsNumber = windowHandlesList.size();
//
//		System.out.println("Total Windows In Number is " + TotalWindowsNumber);
//
//		for (int i = TotalWindowsNumber; i > 1; i--) {
//			PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(i));
//			timeOut();
//			PageDriver.getCurrentDriver().close();
//		}
//		System.out.println("After For Loop");
//	}

	public void HorizontalScroll(WebElement EndingScrollBar) {
		JavascriptExecutor HorizontalScroll = (JavascriptExecutor) PageDriver.getCurrentDriver();
		HorizontalScroll.executeScript("arguments[0].scrollIntoView()", EndingScrollBar);
		timeOut();
	}

	public void ChooseLeaveTypeDropdown(String Value) throws InterruptedException {

		List<WebElement> AllLeaveType = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-select-option\"]//span"));

		Thread.sleep(3000);

		for (WebElement SingleLeave : AllLeaveType) {
			String Info = SingleLeave.getText();
			if (Info.equalsIgnoreCase(Value)) {
				SingleLeave.click();
				break;
			}
		}
	}

	public void FromDate(String GivenYear, String GivenMonth, String GivenDate) {

		String Year = GivenYear;
		String Month = GivenMonth;
		String Date = GivenDate;

		PageDriver.getCurrentDriver().findElement(By.xpath("(//div[@class=\"oxd-date-input\"])[1]//input")).click(); // DateInputField

		while (true) {
			String TakenMonth = PageDriver.getCurrentDriver()
					.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-month\"]//div//p")).getText();
			String TakenYear = PageDriver.getCurrentDriver()
					.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-year\"]//div//p")).getText();
			// DateMonthOnDivTop
			String MonthValue = TakenMonth;
			String YearValue = TakenYear;

			if (MonthValue.equalsIgnoreCase(Month) && YearValue.equalsIgnoreCase(Year)) {
				break;
			} else {
				PageDriver.getCurrentDriver().findElement(By.xpath("(//button[@class=\"oxd-icon-button\"])[2]"))
						.click(); // NextArrowButton
			}
		}

		// Date Selection
		List<WebElement> AllDates = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-calendar-date\"]")); // InsideTableDate

		for (WebElement SingleDate : AllDates) {
			String DateValue = SingleDate.getText();
			if (DateValue.equalsIgnoreCase(Date)) {
				SingleDate.click();
				break;
			}
		}
	}

	public void ToDate(String GivenYear, String GivenMonth, String GivenDate) {

		String Year = GivenYear;
		String Month = GivenMonth;
		String Date = GivenDate;

		PageDriver.getCurrentDriver().findElement(By.xpath("(//div[@class=\"oxd-date-input\"])[2]//input")).click(); // DateInputField

		while (true) {
			String TakenMonth = PageDriver.getCurrentDriver()
					.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-month\"]//div//p")).getText();
			String TakenYear = PageDriver.getCurrentDriver()
					.findElement(By.xpath("//li[@class=\"oxd-calendar-selector-year\"]//div//p")).getText();
			// DateMonthOnDivTop
			String MonthValue = TakenMonth;
			String YearValue = TakenYear;

			if (MonthValue.equalsIgnoreCase(Month) && YearValue.equalsIgnoreCase(Year)) {
				break;
			} else {
				PageDriver.getCurrentDriver().findElement(By.xpath("(//button[@class=\"oxd-icon-button\"])[2]"))
						.click(); // NextArrowButton
			}
		}

		// Date Selection
		List<WebElement> AllDates = PageDriver.getCurrentDriver()
				.findElements(By.xpath("//div[@class=\"oxd-calendar-date\"]")); // InsideTableDate

		for (WebElement SingleDate : AllDates) {
			String DateValue = SingleDate.getText();
			if (DateValue.equalsIgnoreCase(Date)) {
				SingleDate.click();
				break;
			}
		}
	}
}
