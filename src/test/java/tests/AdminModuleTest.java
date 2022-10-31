package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.AdminModule;
import utilities.ExtentFactory;

public class AdminModuleTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() throws InterruptedException {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Admin Module</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void Admin() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Admin Module Testing</b></p>");
		AdminModule Admin = new AdminModule(childTest);
		Admin.Admin();
	}

	@Test(priority = 1)
	public void UpArrowClick() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>UpArrow</b></p>");
		AdminModule UpArrowClick = new AdminModule(childTest);
		UpArrowClick.UpArrowClick();
	}

	@Test(priority = 2)
	public void ClickOnAddButton() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Add Button Click</b></p>");
		AdminModule ClickOnAddButton = new AdminModule(childTest);
		ClickOnAddButton.ClickOnAddButton();
	}

	@Test(priority = 3)
	public void StatusDropDown() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Status Dropdown</b></p>");
		AdminModule StatusDropDown = new AdminModule(childTest);
		StatusDropDown.StatusDropDown();
	}

	@Test(priority = 4)
	public void UserRoleDropDown() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>User Role DropDown</b></p>");
		AdminModule UserRoleDropDown = new AdminModule(childTest);
		UserRoleDropDown.UserRoleDropDown();
	}

	@Test(priority = 5)
	public void EmployeeNameGiving() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Employee Name</b></p>");
		AdminModule EmployeeNameGiving = new AdminModule(childTest);
		EmployeeNameGiving.EmployeeNameGiving();
	}

	@Test(priority = 6)
	public void UserName() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>UserName</b></p>");
		AdminModule UserName = new AdminModule(childTest);
		UserName.UserName();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
