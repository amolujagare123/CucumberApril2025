package stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CreateUseSD {

    WebDriver driver;
    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/imp/4fields.html");
    }
    @When("i enter below data")
    public void i_enter_below_data(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();

        driver.findElement(By.id("name")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("email")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("contact")).sendKeys(data.get(0).get(2));
        driver.findElement(By.id("city")).sendKeys(data.get(0).get(3));


    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {

        driver.findElement(By.xpath("//button")).click();
    }
    @Then("user should be added")
    public void user_should_be_added() {

        String expected = "User is added successfully!";

        String actual = "";

        try
        {
            actual = driver.findElement(By.xpath("//div[@id='successMsg']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals("user is not added",expected,actual);
    }


}
