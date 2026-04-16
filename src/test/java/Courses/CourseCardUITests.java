package Courses;

import Base.BaseTests;
import Pages.CoursesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CourseCardUITests extends BaseTests {
@Test
    public void VerifyCourseCardUI(){
    CoursesPage coursesPage = homePage.clickCoursesPageLink();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'rounded-2xl') and .//h3])[3]")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//img[contains(@src,'http')]")));
    Assert.assertTrue(coursesPage.getCourseImg().isDisplayed(),"Course Image is Not displayed");
    Assert.assertTrue(coursesPage.getCourseTitle().isDisplayed(),"Course Title is Not displayed");
    Assert.assertFalse(coursesPage.getCourseTitle().getText().trim().isEmpty(),"Instructor Name is EMPTY");
    Assert.assertTrue(coursesPage.getSubscribeButton().isDisplayed(), "Subscribe button is NOT displayed");
    Assert.assertTrue(coursesPage.getSubscribeButton().isEnabled(), "Subscribe button is DISABLED");
}
}
