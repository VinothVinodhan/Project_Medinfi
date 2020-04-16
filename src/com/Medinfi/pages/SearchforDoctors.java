package com.Medinfi.pages;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author vinoth
 * 
 *         This class will store all the locators and methods of search page
 */
public class SearchforDoctors {
	WebDriver driver;
	By Locality = By.id("city-locality1");
	By SelectingLocality = By.xpath("//*[@id='autoCityResult1']/li/a");
	By Doctor = By.id("ip1_text1");
	By SelectingDoctorName = By.xpath("//*[@id='res_label2']");
	By Search = By.id("searchIcon");

	// Below constructor is to initialize WebDriver whenever we call this page
	public SearchforDoctors(WebDriver driver) {
		this.driver = driver;
	}

	// Below method is to search operation
	public void searchbydoctor(String City, String Doctorname) throws InterruptedException   {
		driver.findElement(Locality).sendKeys(City);
		driver.findElement(SelectingLocality).click();
		driver.findElement(Doctor).sendKeys(Doctorname);
		Thread.sleep(2000);
		driver.findElement(SelectingDoctorName).click();
	}

	// Below method is to take screenshot
	public void takescreenshot() throws IOException {
		String pwd = System.getProperty("user.dir");
		File sFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sFile, new File(pwd + "\\Output_screen.jpg"));
	}
}