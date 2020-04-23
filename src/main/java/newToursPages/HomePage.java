package newToursPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    private By registerLink = By.linkText("mercuryregister.php");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public RegisterPage clickRegisterLink(){

        driver.findElement(registerLink).click();
        return new RegisterPage(driver);

    }
}

