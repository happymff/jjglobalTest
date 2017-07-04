package test;

import io.appium.java_client.android.AndroidDriver;
import method.GoThroughPageInMain;
import method.Swip;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.InitializeDriver;
import util.IsElementPresent;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class GoThroughPeishiSortTest {
    AndroidDriver driver;
    InitializeDriver initialize;
    GoThroughPageInMain goThroughPageInMain;
    Swip swip;
    IsElementPresent isElementPresent;
    @BeforeMethod
    public  void setUp() throws  Exception {
        initialize = new InitializeDriver("192.168.56.101:5555","5.1");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void goThroughPeishiTest() throws Exception {
        goThroughPageInMain = new GoThroughPageInMain();
        goThroughPageInMain.gointo(3,driver);
        Assert.assertEquals("配饰",driver.findElement(By.id("com.moft:id/category_name")).getText());
        isElementPresent = new IsElementPresent();
        swip = new Swip();
        do {
            swip.swipToDown(driver);
            Boolean elementpresent = isElementPresent.isElementPresent(By.id("com.moft:id/no_more"),driver);
            if (elementpresent){
                break;
            }
        }while(true);
        Thread.sleep(2000);
        Assert.assertEquals("没有更多了",driver.findElement(By.id("com.moft:id/no_more")).getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
