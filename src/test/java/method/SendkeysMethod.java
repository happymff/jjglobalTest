package method;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/2/15.
 */
public class SendkeysMethod {
    AndroidDriver driver;

    public SendkeysMethod(AndroidDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(WebElement webElement,String message) {
        //点击元素
       webElement.sendKeys(message);
    }
}
