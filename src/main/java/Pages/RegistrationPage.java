package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
private WebDriver driver;
private By usernameField = By.id("name");
private By emailAddressField = By.id("email");
private By genderDropDown = By.xpath("//button[@role='combobox' and .//span[contains(text(),'النوع')]]");
private By genderType = By.xpath("//div[@role='option']//span[text()='ذكر']");
private By countryDropDown = By.xpath("//button[@role='combobox' and .//span[contains(text(),'الدولة')]]");
private By egyptcountry = By.xpath("//div[@role='option']//span[text()='مصر']");
private By cityDropDown = By.xpath("//button[@role='combobox' and .//span[contains(text(),'المحافظة')]]");
private By alexandriaCity = By.xpath("//div[@role='option']//span[text()='الإسكندرية']");
private By countryNumDropDown = By.xpath("//select[@class='PhoneInputCountrySelect']");
private By phoneNum = By.id("phone");
private By password = By.id("password");
private By confirmPassword = By.id("confirm_password");
private By terms = By.id("terms");
private By submitButton= By.xpath("//button[@type='submit']");
public RegistrationPage(WebDriver driver){
    this.driver = driver;
}
public void setUsernameField(String username){
driver.findElement(usernameField).sendKeys(username);
}
public void setEmailAddressField(String emailAddress){
    driver.findElement(emailAddressField).sendKeys(emailAddress);
}
public void setPhoneNum(String EnterPhoneNum){
    driver.findElement(phoneNum).sendKeys(EnterPhoneNum);
}
public void setPassword(String EnterPassword){
    driver.findElement(password).sendKeys(EnterPassword);
}
public void setConfirmPassword(String EnterConfirmPassword){
    driver.findElement(confirmPassword).sendKeys(EnterConfirmPassword);
}
public void clickGender(){
    driver.findElement(genderDropDown).click();
}
public void clickCountry(){
    driver.findElement(countryDropDown).click();
}
public void clickCity(){
    driver.findElement(cityDropDown).click();
}
public void clickCountryNum(){
    driver.findElement(countryNumDropDown).click();
}
public void clickTerm(){
    driver.findElement(terms).click();
}
public void clickSubmitButton(){
    driver.findElement(submitButton).click();
}
public void chooseGenderTypeClick(){
    driver.findElement(genderType).click();
}
public void chooseCountryClick(){
    driver.findElement(egyptcountry).click();
}
public void chooseCityClick(){
    driver.findElement(alexandriaCity).click();
}
}
