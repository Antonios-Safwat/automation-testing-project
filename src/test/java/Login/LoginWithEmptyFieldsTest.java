package Login;
import Base.BaseTests;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class LoginWithEmptyFieldsTest extends BaseTests {
    @Test
    public void LoginWithEmptyFields(){
        LoginPage loginPage = homePage.clickLoginPageLink();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginPage.clickLoginButton();
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'البريد الإلكتروني مطلوب')]")).isDisplayed());
    }
}
