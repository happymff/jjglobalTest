
package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mengfeifei on 2017/1/6.
 */
public class AboutUSPage {
    AndroidDriver driver ;
    public WebElement username,accountManage,noPay;
    public AboutUSPage(AndroidDriver driver){
        this.driver = driver;
    }
    public void aboutUSPage(){
        //用户名
        username = driver.findElement(By.id("com.moft:id/account_name"));
        //用户头像
        username = driver.findElement(By.id("com.moft:id/user_head"));
        //账户管理
        List<WebElement> w1 =driver.findElementById("com.moft:id/account_manage").findElements(By.className("android.widget.TextView"));
        accountManage = w1.get(w1.size()-1);
        //待付款
        noPay = driver.findElement(By.id("com.moft:id/no_payment_orders"));
    }


}
