package method;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/2/15.
 */
public class ClearMethod {
    AndroidDriver driver;

    public ClearMethod(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clear(WebElement webElement) {
        //点击元素
       webElement.clear();
    }
}
