
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class AboutUS {
    AndroidDriver driver ;
    public WebElement username,accountManage,noPay;
    public AboutUS(AndroidDriver driver){
        this.driver = driver;
    }
    public void aboutUSPage(){
        //用户名
        username = driver.findElement(By.id("com.moft:id/account_name"));
        //账户管理
        accountManage = driver.findElementByName("账户管理");
        //待付款
        noPay = driver.findElement(By.id("com.moft:id/no_payment_orders"));
    }


}
