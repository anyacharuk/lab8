package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMHome;

public class CreateAccountTest extends BaseTest {
    private static final String MESSAGE = "email";

    @Test
    public void createAccountTest() {
        WebElement actualMessage = new HMHome(driver)
                .clickOnMyAccountButton()
                .clickOnContinueButton()
                .checkEnterUserEmail();
        Assert.assertEquals(actualMessage.getAttribute("id"), MESSAGE);
    }
}