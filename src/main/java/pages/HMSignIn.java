package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HMSignIn extends HMBase {

    private String header =  "//div[@class='aCYP __6d0r']";

    public HMSignIn(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage clickOnContinueButton(){
        waitForElementToAppear(header);
        WebElement signInButton = driver.findElement(By.xpath(header));
        signInButton.click();
        return new CreateAccountPage(driver);
    }
}