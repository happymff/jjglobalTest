package method;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mengfeifei on 2017/2/15.
 */
public class ClickMethod {
    AndroidDriver driver;

    public ClickMethod(AndroidDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement webElement) {
        //点击元素
       webElement.click();
    }
}
