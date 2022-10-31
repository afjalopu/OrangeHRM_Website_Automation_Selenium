package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LeaveModule;
import utilities.ExtentFactory;

public class LeaveModuleTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() throws InterruptedException {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>PIM Module</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void LeaveModuleClick() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Leave Module Click</b></p>");
		LeaveModule LeaveModuleClick = new LeaveModule(childTest);
		LeaveModuleClick.LeaveModuleClick();
	}

	@Test(priority = 1)
	public void EntitlementForMultipleEmployee() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>For Multiple Employee</b></p>");
		LeaveModule EntitlementForMultipleEmployee = new LeaveModule(childTest);
		EntitlementForMultipleEmployee.EntitlementForMultipleEmployee();
	}

	@Test(priority = 2)
	public void AdminApplyForLeave() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Admin Leave Apply Section Module</b></p>");
		LeaveModule AdminApplyForLeave = new LeaveModule(childTest);
		AdminApplyForLeave.AdminApplyForLeave();
	}

	@Test(priority = 3)
	public void AssignleaveSection() throws IOException {
		childTest = parentTest.createNode(
				"<p style=\"color:DarkBlue; font-size:20px\"><b>Employee Leave Apply Section Module</b></p>");
		LeaveModule AssignleaveSection = new LeaveModule(childTest);
		AssignleaveSection.AssignleaveSection();
	}

	@Test(priority = 4)
	public void EntitlementForIndividualEmployee() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>For Individual Employee</b></p>");
		LeaveModule EntitlementForIndividualEmployee = new LeaveModule(childTest);
		EntitlementForIndividualEmployee.EntitlementForIndividualEmployee();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
