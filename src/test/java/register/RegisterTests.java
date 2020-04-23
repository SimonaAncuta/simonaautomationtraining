package register;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTests {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");

        driver.manage().window().maximize();

        WebElement inputsLink = driver.findElement(By.linkText("REGISTER"));
        inputsLink.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }
    public static void main(String args[]){
        RegisterTests test = new RegisterTests();
        test.setUp();
    }
}
