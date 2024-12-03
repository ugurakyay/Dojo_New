package Tests;

import PageObjects.LoginPageObject;
import PageObjects.RolesManagementPageObject;
import PageObjects.UserManagementPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RolesManagementTest extends BaseWebAutomationTest {
    private LoginPageObject login;

    private RolesManagementPageObject Role;
    //private Object User;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        Allure.step("Page objects initialized");
        Role= new RolesManagementPageObject();

    }

    @Test(description = "Test roles management functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the roles functionality of the application.")
    @Epic("Roles Management")
    @Feature("Roles Management Page")
    @Story("User should be able to manage roles successfully")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");


       // Role.RolesManagementButtonClick();

    Role.RolesButtonClick();
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

