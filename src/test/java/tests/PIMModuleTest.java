package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.PIMModule;
import utilities.ExtentFactory;

public class PIMModuleTest extends BaseDriver {

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
	public void PIMModuleClick() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>PIM Module Testing</b></p>");
		PIMModule PIMModuleClick = new PIMModule(childTest);
		PIMModuleClick.PIMModuleClick();
	}

	@Test(priority = 1)
	public void NameGiving() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Name Giving</b></p>");
		PIMModule NameGiving = new PIMModule(childTest);
		NameGiving.NameGiving();
	}

	@Test(priority = 2)
	public void NickNameOtherIDDrivingLicenseGiving() throws IOException {
		childTest = parentTest.createNode(
				"<p style=\"color:DarkBlue; font-size:20px\"><b>NickName To Driving License Giving</b></p>");
		PIMModule NickNameOtherIDDrivingLicenseGiving = new PIMModule(childTest);
		NickNameOtherIDDrivingLicenseGiving.NickNameOtherIDDrivingLicenseGiving();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
