package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.ListAccountPage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {

	LoginPage loginPage;
	DatabasePage databasePage;
	ListAccountPage listAccountPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage= new DatabasePage();
		listAccountPage= PageFactory.initElements(driver, ListAccountPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {

		driver.get("https://qa.codefios.com/");
	}

	@When("user enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {

		loginPage.enterUserName(username);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		loginPage.enterPassword(password);
	}
	
	@When("user enter the {string} from mysql database")
	public void user_enters_the_from_mysql_database(String loginData) {
	   switch(loginData){
	   case "username":
		   loginPage.enterUserName(databasePage.getDataFromDataBase("user_name")); 
		   break;
	   case "password":
		   loginPage.enterPassword(databasePage.getDataFromDataBase("user_password"));
		   break;
		   default: System.out.println("unable to find login data"+ loginData);
	   }
	}

	@And("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should be able to land on dashboard page")
	public void user_should_be_able_to_land_on_dashboard_page() {
		String expectedTitle = "Codefios QA";
		String actualTitle = loginPage.getPageTitle();
		takeScreenshot(driver);
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@When("user click on the List account tab")
	public void user_click_on_the_List_account_tab() {
		listAccountPage.clickOnListaccountTab();
	}

	@When("user click on the add account tab")
	public void user_click_on_the_add_account_tab() {
		listAccountPage.clickOnAddAccountTab();
	}

	
	@When("User enters account accountName as {string}")
	public void user_enters_account_accountName_as(String string) {
		
		listAccountPage.enterAccountName(string);
		
	}

	@When("User enters account description as {string}")
	public void user_enters_account_description_as(String string) {
		listAccountPage.enterDescription(string);
	}

	

	@When("User enters account accountNumber as {string}")
	public void user_enters_account_accountNumber_as(String string) {
		listAccountPage.enterAccountNumber(string);;
	}

	@When("User enters account contactPerson as {string}")
	public void user_enters_account_contactPerson_as(String string) {
		listAccountPage.enterContactPerson(string);;
	}

	
	@When("User enters account initialBalance as {string}")
	public void user_enters_account_initialBalance_as(String string) {
		listAccountPage.enterInitialBalance(string);}


	@When("user click on save button")
	public void user_click_on_save_button() {
		listAccountPage.clickOnSave();
	}

	@Then("new account should successfuly get created")
	public void new_account_should_successfuly_get_created() {
		
		listAccountPage.assertSucessMsg();
		driver.navigate().refresh();
		try {
		    Thread.sleep(2000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		  
		takeScreenshot(driver);
		
	}




	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
