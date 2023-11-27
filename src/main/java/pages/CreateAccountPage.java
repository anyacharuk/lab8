package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends HMBase{

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement checkEnterUserEmail() {
        String emailField = "//input[@id='email']";
        waitForElementToAppear(emailField);
        WebElement field =  driver.findElement(By.xpath(emailField));
        return  field;
    }


}
