package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMemberSD {
    WebDriver driver;

    @Given("I am on add member page")
    public void i_am_on_user_registration_page() {
        // code to navigate to registration page
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/imp/5fileds.html");
    }

    @When("i enter {} , {} ,{}, {} , {}")
    public void i_enter_user_details(String name, String email, String contact, String city, String address) {
        // code to fill in user details
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("contact")).sendKeys(contact);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("address")).sendKeys(address);


    }

    @When("I click on add button")
    public void i_click_on_submit_button() {
        // code to click submit
    }

    @Then("member should be added")
    public void user_should_be_added() {
        // code to verify user is added
    }
}
