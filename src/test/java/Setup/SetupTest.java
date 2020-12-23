package Setup;

import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class SetupTest {
    private WebDriver driver;
    protected LoginPage loginpage;

    @BeforeTest
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.konga.com/");
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a")).click();
        loginpage = new LoginPage(driver);
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }


}    