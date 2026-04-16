package Base;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;
    @BeforeMethod
    public void setup(){
driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
driver.manage().window().maximize();
driver.get("https://eyouthlearning.com/ar");
        homePage = new HomePage(driver);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
  }
@AfterMethod
public void tearDown(){
    driver.quit();
}
}
