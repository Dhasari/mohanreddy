package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;



public class OrangeHRMsteps {
	
	WebDriver driver;
	@Given("I launch Chrome Browser")
	public void i_launch_chrome_browser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--remote-allow-origins=*");
	  //ChromeDriver driver=new ChromeDriver(option);
	   driver=new ChromeDriver(option);
	}

	@When("I open OrangeHRM homepage")
	public void i_open_orange_hrm_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}

	@Then("I verify that the Logo presence on page")
	public void i_verify_that_the_logo_presence_on_page() {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  Assert.assertEquals(true,status);
	   
	}
	
	@And("close Browser")
	public void close_browser() {
		driver.quit();
	   
	}



}
