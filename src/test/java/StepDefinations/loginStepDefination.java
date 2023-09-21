package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination {

 public WebDriver driver;
 

@Given("I navigate to the login page")
public void i_navigate_to_the_login_page() {
   System.out.println("Hello1");
}
@When("I submit username and password")
public void i_submit_username_and_password() {
   System.out.println("Hello2");
}
@Then("I should be logged in")
public void i_should_be_logged_in() {
   System.out.println("Hello3");
}

 
 @Given("Intializae thr bowser with chrome")
 public void intializae_thr_bowser_with_chrome() {
    
  driver=new ChromeDriver();
  
 }
 @And("navigate to {string}")
 public void navigate_to(String url) {
   
  
  driver.get(url);
  
 }
 @When("^user enters (.+) and (.+) and clicks on  click$")
 public void user_enters_and_and_clicks_on_click(String username, String password) throws Throwable {

  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
  driver.findElement(By.xpath("//input[@id='Login']")).click();
 

 }

 @Then("user should be logged in succesfuuly")
 public void user_should_be_logged_in_succesfuuly() {
   
  System.out.println("hello");
  
 }




}