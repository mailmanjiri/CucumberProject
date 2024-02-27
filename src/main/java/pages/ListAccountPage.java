package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListAccountPage {
	WebDriver driver;
	 public ListAccountPage(WebDriver driver) {
	  this.driver = driver;  
	 } 
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//a[@title='List Accounts']")
	 public WebElement listAccountTabElement;
	 
	 @FindBy(how = How.XPATH, using = "//button[text()='Add Account']")
	 public WebElement addAccountTabElement;
	 
	 @FindBy(how = How.XPATH, using = "//h5[@id='accountModalLabel']")
	 public WebElement addAccountHeaderElement;
	 
	 @FindBy(how= How.XPATH, using= "//input[@id='account_name']")
	 public WebElement accountNameElement;
	 
	 @FindBy(how= How.XPATH, using= "//textarea[@id='description']")
	 public WebElement descriptionElement;
	 
	 @FindBy(how= How.XPATH, using= "//input[@id='balance']")
	 public WebElement initialBalanceElement;
	 
	 @FindBy(how= How.XPATH, using= "//input[@id='account_number']")
	 public WebElement accountNumberElement;
	 
	 @FindBy(how= How.XPATH, using= "//input[@id='contact_person']")
	 public WebElement contactPersonElement;
	 
	 @FindBy(how= How.XPATH, using= "//button[@id='accountSave']")
	 public WebElement saveElement;
	 
	 @FindBy(how= How.XPATH, using= "//div[text()='Account Added Successfully.']")
	 public WebElement SuccessMsg;
	 
	 
	 //methods to interact elements
	 
	 public void clickOnListaccountTab() {
		 listAccountTabElement.click();
	 }
	 
	 public void clickOnAddAccountTab() {
		 addAccountTabElement.click();
	 }
	 
	 public void enterAccountName(String accountname) {
		 accountNameElement.sendKeys(accountname);
	 }
	 
	 public void enterDescription(String description ) {
		 descriptionElement.sendKeys(description);
	 }
	 
	 public void enterInitialBalance(String initialBalance) {
		 initialBalanceElement.sendKeys(initialBalance);
	 }
	 
	 public void enterAccountNumber(String accountNumber) {
		 accountNumberElement.sendKeys(accountNumber);
	 }
	 
	 public void enterContactPerson(String contactPerson) {
		 contactPersonElement.sendKeys(contactPerson);
	 }
	 
	 public void clickOnSave() {
		 saveElement.click();
	 }
	 
	 public void assertSucessMsg() {
		 SuccessMsg.isDisplayed();
	 }
	 
	 

}
