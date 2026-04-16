package SocialLinks;
import Base.BaseTests;
import Pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class FacebookLinkTest extends BaseTests {
    @Test
    public void verifyFacebookLink() {
        HomePage homePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        String originalWindow = driver.getWindowHandle();
        homePage.clickFaceBook();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        wait.until(ExpectedConditions.urlContains("facebook.com"));
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }
}