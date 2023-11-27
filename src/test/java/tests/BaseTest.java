package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    private static final String OSCOMMERCE_URL = "https://www2.hm.com/en_gb/index.html";

    @BeforeTest
    public void createDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get(OSCOMMERCE_URL);
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}