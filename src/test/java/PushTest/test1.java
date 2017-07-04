package PushTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2017/6/27.
 */


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class test1 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/mengfeifei/Downloads/chromedriver");
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        baseUrl = "http://www.baidu.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSelenium() throws Exception

    {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("kw")).click();
        driver.findElement(By.id("kw")).sendKeys("selenium");
        Thread.sleep(5000);
        driver.findElement(By.id("su")).click();
        driver.quit();

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
