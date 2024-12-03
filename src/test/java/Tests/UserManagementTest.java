package Tests;

import PageObjects.LoginPageObject;
import PageObjects.UserManagementPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserManagementTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private UserManagementPageObject User;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        Allure.step("Page objects initialized");
        User =new UserManagementPageObject();
    }

    @Test(description = "Test user management functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the user management functionality of the application.")
    @Epic("User Management")
    @Feature("User Management Page")
    @Story("Admin should be able to manage users successfully")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to user management page");

        login.login();
        Allure.step("Logging into the application");
        
        User.ManagementButtonClick();

        login.logOut();
        Allure.step("Logging out from the application");
    }

    @Override
    public void navigateTo() {
        Allure.step("Navigating to the base URL of the application");
    }

    @Override
    public boolean isPresent() {
        Allure.step("Checking if the element is present");
        return false;
    }
}
