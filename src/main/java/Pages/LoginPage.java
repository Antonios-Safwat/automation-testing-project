package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[@type='submit']");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void EnterEmailField(String Email){
        driver.findElement(emailField).sendKeys(Email);
    }
    public void EnterPasswordField(String Password){
        driver.findElement(passwordField).sendKeys(Password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
