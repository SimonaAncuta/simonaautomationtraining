package newToursPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage {

    private WebDriver driver;
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By phoneField = By.id("phone");
    private By emailField = By.id("userName");
    private By addressField = By.id("address1");
    private By cityField = By.id("city");
    private By stateField = By.id("state");
    private By postalCodeField = By.id("postalCode");
    private By userNameField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By submitButton = By.id("register");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setfirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void setlastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    public void setCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }
    public void setState(String state) {
        driver.findElement(stateField).sendKeys(state);
    }
    public void setPostalCode(String postalCode) {
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }
    public void setuserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public SuccessRegisterPage clickSubmitButton() {
        driver.findElement(submitButton).click();
        return new SuccessRegisterPage(driver);
    }

    }



