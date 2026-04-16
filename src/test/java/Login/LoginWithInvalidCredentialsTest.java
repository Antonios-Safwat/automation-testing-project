package Login;
import Base.BaseTests;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class LoginWithInvalidCredentialsTest extends BaseTests {
    @Test
    public void InvalidCredentials(){
        LoginPage loginPage= homePage.clickLoginPageLink();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        loginPage.EnterEmailField("InvalidEmail");
        loginPage.EnterPasswordField("@InvalidPassword");
        loginPage.clickLoginButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'عنوان بريد إلكتروني غير صالح')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'عنوان بريد إلكتروني غير صالح')]")).isDisplayed());
    }
}
