package Login;

import Base.BaseTests;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class EndToEndTest extends BaseTests {
    @Test
    public void EndToEnd(){
        LoginPage loginPage= homePage.clickLoginPageLink();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        loginPage.EnterEmailField("Tonysafwat1122@gmail.com");
        loginPage.EnterPasswordField("@Tony123");
        loginPage.clickLoginButton();
        homePage.clickAllCourses();
        homePage.clickOnTheCourse();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='اشترك الآن'])[1]")));
        homePage.clickSubscribeButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='إدارة التغيير والعمل الجماعي']")));
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='إدارة التغيير والعمل الجماعي']")).isDisplayed());
    }
}
