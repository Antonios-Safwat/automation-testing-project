package Registration;

import Base.BaseTests;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class VerifyRegistrationPage extends BaseTests {
    @Test
    public void openRegistrationPageTest(){
        HomePage homePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'حساب جديد')]")));
        homePage.clickOnRegisterLink();
        wait.until(ExpectedConditions.urlContains("/ar/auth/register"));
        Assert.assertTrue(driver.getCurrentUrl().contains("/ar/auth/register"),"You are in wrong page!");
    }
}
