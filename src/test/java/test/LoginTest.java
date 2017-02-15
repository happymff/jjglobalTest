package test;

import data.DataProvid;
import io.appium.java_client.android.AndroidDriver;
import method.ClearMethod;
import method.ClickMethod;
import method.SendkeysMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.AboutUS;
import page.Login;
import page.LoginAndRegister;
import page.MainPage;
import util.InitializeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mengfeifei on 2016/12/29.
 */
public class LoginTest {
    AndroidDriver driver;
    InitializeDriver initialize;
    MainPage mainpage;
    LoginAndRegister lr;
    Login login;
    AboutUS aboutUS;
    @BeforeMethod
    public  void setUp() throws  Exception {
        initialize = new InitializeDriver("192.168.56.102:5555","7");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), initialize.driverInitialize());
        // initializing explicit wait object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test(description = "测试账号登录",dataProvider = "LoginSucess",dataProviderClass = DataProvid.class)
    public void loginTest(String username, String pwd) throws Exception {
        Thread.sleep(3000);
        mainpage = new MainPage(driver);
        mainpage.mainPage();
        mainpage.aboutButton.click();
        lr = new LoginAndRegister(driver);
        lr.loginAndRegpage();
        lr.loginButton.click();
        login = new Login(driver);
        login.loginPage();
        login.username.clear();
        login.username.sendKeys(username);
        login.pwd.clear();
        login.pwd.sendKeys(pwd);
        Thread.sleep(2000);
        login.loginButton.click();
        aboutUS = new AboutUS(driver);
        aboutUS.aboutUSPage();
        Assert.assertEquals(aboutUS.username,"林夕飞飞");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
