package com.Medinfi.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Medinfi.pages.SearchforDoctors;
import package_OtherOperations.ExcelFileHandle;

/**
 * @author Vinoth
 *
 */
public class Testcase_SearchByDoctor {
	@Test
	public void verifysearch() throws IOException, InterruptedException {
		String pwd = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pwd + "\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximizing the window
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		// Navigate to particular url
		String url;
		url = ExcelFileHandle.getInputData("Input_URL");
		driver.get(url);

		// Now we are calling the SearchforDoctor class & import the package
		SearchforDoctors Search = new SearchforDoctors(driver);

		// Below codes are to take inputs from Input File.xlsx file
		String Locality, Doctorname;
		Locality = ExcelFileHandle.getInputData("Input_Locality");
		Doctorname = ExcelFileHandle.getInputData("Input_Doctorname");

		// Calling searchbydoctor method to execute actual steps
		Search.searchbydoctor(Locality, Doctorname);
		Search.takescreenshot();
		driver.quit();

	}

}



