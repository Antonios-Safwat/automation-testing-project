package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private By searchIcon = By.xpath("//input[@type='search']");
    private By keyWord = By.xpath("//span[contains(@class,'text-secondary')]");
    private By courses = By.xpath("//a[@href='/ar/courses' and text()='الدورات التدريبية']");
    private By course = By.xpath("//h3[text()='إدارة التغيير والعمل الجماعي']");
    private By registration = By.xpath("//a[contains(text(),'حساب جديد')]");
    private By SubscribeButton = By.xpath("(//button[normalize-space()='اشترك الآن'])[1]");
    private By faceBook = By.xpath("//a[contains(@href,'facebook.com')]");
    private By linkedInIcon = By.xpath("//a[contains(@href,'linkedin.com')]");
    private By instagramIcon = By.xpath("//a[contains(@href,'instagram.com')]");

    public void clickSearchIcon() {
        driver.findElement(searchIcon).click();
    }
    public void clickSubscribeButton(){
    driver.findElement(SubscribeButton).click();
    }
    public void enterSearchKeyword(String keyword) {
        WebElement input = driver.findElement(searchIcon);
        input.clear();
        input.sendKeys(keyword);
    }
    public void clickSearchButton() {
        driver.findElement(keyWord).click();
    }
    public void clickAllCourses() {
        driver.findElement(courses).click();
    }
    public void clickOnTheCourse() {
        driver.findElement(course).click();
    }
    public void clickOnRegisterLink() {
        driver.findElement(registration).click();
    }
    public RegistrationPage clickRegistrationPageLink() {
        driver.findElement(By.xpath("//a[contains(text(),'حساب جديد')]")).click();
        return new RegistrationPage(driver);
    }
    public LoginPage clickLoginPageLink(){
        driver.findElement(By.xpath("//a[contains(@href,'/auth/login') and contains(text(),'تسجيل الدخول')]")).click();
        return new LoginPage(driver);
    }
    public CoursesPage clickCoursesPageLink(){
        driver.findElement(By.xpath("//a[@href='/ar/courses' and text()='الدورات التدريبية']")).click();
        return  new CoursesPage(driver);
    }
    public void clickFaceBook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(faceBook)
        );
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        wait.until(ExpectedConditions.elementToBeClickable(faceBook));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void clickLinkedIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(linkedInIcon)
        );
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        wait.until(ExpectedConditions.elementToBeClickable(linkedInIcon));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
    public void clickInstagram() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(instagramIcon)
        );
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        wait.until(ExpectedConditions.elementToBeClickable(instagramIcon));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }
}



