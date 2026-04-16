package Registration;
import Base.BaseTests;
import Pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class RegisterWithAnEmptyUsernameFieldTest extends BaseTests {
    @Test
    public void RegisterWithAnEmptyUsernameField(){
        RegistrationPage registrationPage = homePage.clickRegistrationPageLink();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        registrationPage.setEmailAddressField("Tony123@gmai.com");
        registrationPage.clickCountry();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option']//span[text()='مصر']")));
        registrationPage.chooseCountryClick();
        registrationPage.clickCity();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option']//span[text()='الإسكندرية']")));
        registrationPage.chooseCityClick();
        registrationPage.clickGender();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option']//span[text()='ذكر']")));
        registrationPage.chooseGenderTypeClick();
        registrationPage.setPhoneNum("01122122128");
        registrationPage.setPassword("Tony123");
        registrationPage.setConfirmPassword("Tony123");
        registrationPage.clickTerm();
        registrationPage.clickSubmitButton();
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'الاسم مطلوب')]")).isDisplayed(),"Section الأسم مطلوب is not displayed");
    }
}
