package Courses;
import Base.BaseTests;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class CourseDetailsTest extends BaseTests {
    @Test
    public void VerifyCourseDetails(){
        HomePage homePage = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        homePage.clickAllCourses();
        homePage.clickOnTheCourse();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'نظرة عامة')]")));
        Assert.assertTrue(driver.getCurrentUrl().contains("/ar/courses/change-management-and-team-working"),"Course details page didn't open!");
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'نظرة عامة')]")).isDisplayed(),"Section نظرة عامة is not displayed! ");
    }
}
