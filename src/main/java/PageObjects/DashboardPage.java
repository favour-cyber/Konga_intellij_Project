package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By Computers_and_Accessories = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[3]/div/a[2]");
    private By Laptop =By.xpath("//*[@id=\"mainContent\"]/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a");

    public void clickComputer_and_Accessories() throws InterruptedException
    {
        Thread.sleep(10000);
        driver.findElement(Computers_and_Accessories).click();
    }

    public void clickLaptop() throws InterruptedException
    {
        Thread.sleep(60000);
        driver.findElement(Laptop).click();
    }

    private By AppleMacBooks = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li/a/ul/li[1]/a/label/span");

    public void clickAppleMacBooks() throws  InterruptedException
    {
        Thread.sleep(1000);
        driver.findElement(AppleMacBooks).click();
    }

    private By MyAccount = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/span");
    private  By Logout = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a");

    public void clickMyAccount() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.findElement(MyAccount).click();
    }

    public LoginPage clickLogout() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(Logout).click();
        return new LoginPage(driver);
    }

}