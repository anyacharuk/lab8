package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HMHome extends HMBase{

    private WebElement loginLink = driver.findElement(By.xpath("//button[@class='CGae mYRh vEfo __5DXf']"));

    public HMHome(WebDriver driver) {
        super(driver);
    }

    public HMSignIn clickOnMyAccountButton(){
//        waitForElementToAppear("//button[@class='CGae mYRh vEfo __5DXf']");
        loginLink.click();


        return new HMSignIn(driver);
    }
}