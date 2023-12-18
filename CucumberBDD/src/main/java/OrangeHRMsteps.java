
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMsteps {

	WebDriver driver;
@Given("I launch Chrome Browser")
public void i_launch_chrome_browser() {
  System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
}

@When("I open OrangeHRM homepage")
public void i_open_orange_hrm_homepage() {
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
   
}

@Then("I verify that the Logo presence on page")
public void i_verify_that_the_logo_presence_on_page() {
boolean	status=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isSelected();

    
}

@And("close Browser")
public void close_browser() {
    driver.quit();
}




}

