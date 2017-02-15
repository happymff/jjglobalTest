
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class Login {
    AndroidDriver driver ;
    public WebElement backButton,username,pwd,loginButton,forgetPwd;
    public Login(AndroidDriver driver){
        this.driver = driver;
    }
    public void loginPage(){
        //返回按钮
        backButton = driver.findElement(By.id("com.moft:id/back"));
        //用户名
        username = driver.findElement(By.id("com.moft:id/username_text"));
        //密码
        pwd = driver.findElement(By.id("com.moft:id/password_text"));
        //密码
        loginButton = driver.findElement(By.className("android.widget.LinearLayout"));
        forgetPwd = driver.findElement(By.id("com.moft:id/forger_password"));
    }


}
