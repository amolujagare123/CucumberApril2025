package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {
    WebDriver driver;
    @Given("I am on login page")
    public void loginpage()
    {
        System.out.println("I am on login page");



        driver.get("https://stock.scriptinglogic.in/");
    }

    @When("i enter correct username & password")
    public void iEnterCorrectUsernamePassword() {
        System.out.println("i enter correct username & password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }

    @Then("i should go to the home page")
    public void iShouldGoToTheHomePage() {
        System.out.println("i should go to the home page");

        String expected = "https://stock.scriptinglogic.in/dashboard.php";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("thus is not a dashboard",expected,actual);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        System.out.println("click on login button");
        driver.findElement(By.name("submit")).click();
    }

    @When("i enter incorrect username & password")
    public void iEnterIncorrectUsernamePassword() {
        driver.findElement(By.id("login-username")).sendKeys("sdsds");
        driver.findElement(By.id("login-password")).sendKeys("dsdsd");

    }

    @Then("i should go to error page")
    public void iShouldGoToErrorPage() {
        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();
        Assert.assertEquals("thus is not a dashboard",expected,actual);
    }

    @When("i enter blank username & password")
    public void iEnterBlankUsernamePassword() {
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");

    }

    @When("i enter {string} & {string}")
    public void iEnter(String username, String password) {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);

    }

    @Given("i open browser")
    public void iOpenBrowser() {
        driver = new ChromeDriver();
    }

    @And("i maximize it")
    public void iMaximizeIt() {
        driver.manage().window().maximize();
    }
}
