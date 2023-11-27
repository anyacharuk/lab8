package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HMBase {

    private static final int TIMEOUT = 15;

    protected WebDriver driver;
    private WebDriverWait wait;

    public HMBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    protected void waitForElementToAppear(String element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }
}
