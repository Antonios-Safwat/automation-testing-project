package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursesPage {
    WebDriver driver;
    public CoursesPage(WebDriver driver){
        this.driver=driver;
    }
    private By courseCard = By.xpath("(//div[contains(@class,'rounded-2xl') and .//h3])[3]");
    private By courseImg = By.xpath(".//img[contains(@src,'http')]");
    private By courseTitle = By.xpath(".//h3");
    private By instructorName = By.xpath(".//h6");
    private By subscribeButton = By.xpath(".//button[contains(.,'اشترك')]");
    public WebElement getCourseCard(){
        return driver.findElement(courseCard);
    }
    public WebElement getCourseImg(){
        return getCourseCard().findElement(courseImg);
    }
    public WebElement getCourseTitle(){
        return getCourseCard().findElement(courseTitle);
    }
    public WebElement getInstructorName(){
        return getCourseCard().findElement(instructorName);
    }
    public WebElement getSubscribeButton(){
        return getCourseCard().findElement(subscribeButton);
    }
}
