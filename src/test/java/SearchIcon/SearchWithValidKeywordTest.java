package SearchIcon;
import Base.BaseTests;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class SearchWithValidKeywordTest extends BaseTests {
    @Test
    public void verifySearchWithValidKeyword (){
        HomePage homePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        String Keyword = "كيف تنضم إلى البنك";
        homePage.clickSearchIcon();
        homePage.enterSearchKeyword(Keyword);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//mark[contains(text(),'كيف تنضم إلى البنك')]")
        ));
        homePage.clickSearchButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//h1[contains(text(),'كيف تنضم إلى البنك')])[1]")
        ));
        String text = driver.findElement(By.xpath("(//h1[contains(text(),'كيف تنضم إلى البنك')])[1]")).getText();
        Assert.assertTrue(text.contains(Keyword),"Page title doesn't match");
    }
}
