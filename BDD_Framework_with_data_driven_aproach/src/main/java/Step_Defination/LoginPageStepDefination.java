package Step_Defination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDefination {

	WebDriver driver;
	Properties prop;
	FileOutputStream fos;
	String FilePath1="F:\\Cucumber\\BDD_Framework_with_data_driven_aproach\\Extent-Report\\extent_report.html";
	ExtentReports report = new ExtentReports(FilePath1);
	ExtentTest test = report.startTest("LoginPageStepDefination");
	public LoginPageStepDefination() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("F:\\Cucumber\\BDD_Framework_with_data_driven_aproach\\src\\main\\java\\TestData\\configu.properties");
		prop.load(fis);
		fos = new FileOutputStream("F:\\Cucumber\\BDD_Framework_with_data_driven_aproach\\src\\main\\java\\TestData\\configu.properties");
	}

	@Given("^user is on login page$")
	public void user_opened_url(){
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		driver= new ChromeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		test.log(LogStatus.FAIL, "test Case Failed");
		String title=driver.getTitle();
		try {
			prop.setProperty("title", title);
			prop.store(fos, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@When("^enters valid \"(.*)\" and password And click on login button$")
	public void enters_correct_user_name_and_password(String username) {
		//String usname= prop.getProperty("username");
		//String pass = prop.getProperty("password");
		driver.findElement(By.id("userNameInput")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys("P@war123");
		driver.findElement(By.id("submitButton")).click();
		test.log(LogStatus.FAIL, "test Case Failed");

	}


	@Then("^home page is gets open$")
	public void user_logged_in_system_successfuly()  {
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals("CRMPRO", actualtitle);
		driver.quit();
		test.log(LogStatus.FAIL, "test Case Failed");
	} 


}
