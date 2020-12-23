package Login;

import PageObjects.DashboardPage;
import Setup.SetupTest;
import org.testng.annotations.Test;

public class LoginTest extends SetupTest {

    @Test
    public void testLogin() throws InterruptedException
    {
        String username = "iloriadenike5@gmail.com";
        loginpage.enterUsername(username);
        loginpage.enterPassword("favour2020");

        DashboardPage dashboardPage = loginpage.clickLoginBtn();
        dashboardPage.clickComputer_and_Accessories();
        dashboardPage.clickLaptop();
        dashboardPage.clickAppleMacBooks();
        dashboardPage.clickMyAccount();
        loginpage = dashboardPage.clickLogout();
    }
}