package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class LoginEx {
	
	

@Given("I navigated the login page")
public void i_navigated_the_login_page() {

	WebDriver driver = new ChromeDriver();

	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://tutorialsninja.com/demo/");
}

	

}
