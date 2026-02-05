// package stepDefinitions;

// import org.junit.jupiter.api.Assertions;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;

// public class Activity4Steps extends Base {
// WebDriver driver;

//     @Given("the user is on the login page")
//     public void the_user_is_on_the_login_page() {
//         driver = new ChromeDriver();
//         driver.get("https://training-support.net/webelements/login-form");
//     }

//     @When("the user enters {string} and {string}")
//     public void the_user_enters_username_and_password(String username, String password) {

//         WebElement userField = driver.findElement(By.id("username"));
//         WebElement passField = driver.findElement(By.id("password"));

//         userField.sendKeys(username);
//         passField.sendKeys(password);
//     }

//     @And("clicks the submit button")
//     public void clicks_the_submit_button() {
//         driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
//     }

//     @Then("get the confirmation text and verify message as {string}")
//     public void verify_confirmation(String expectedMessage) {
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/main/div/div/div/div/div")));
//         String actualMessage =
//                 driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h2")).getText();

//         Assertions.assertEquals(actualMessage, expectedMessage);
//     }

// }
