package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By username = By.name("username");

    public void enterUsername(String uName) {
        driver.findElement(username).sendKeys(uName);
    }

    public void enterPassword(String pad) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(pad);
    }

    public DashboardPage clickLoginBtn() {
       driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
       return new DashboardPage(driver);
    }
}
