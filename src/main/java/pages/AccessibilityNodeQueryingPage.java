package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityNodeQueryingPage {
    WebDriver driver;

    private By accessibilityNodeQuery_locator = AppiumBy.accessibilityId("Accessibility Node Provider");
    private By accessibilityNodeQuery_Button = AppiumBy.accessibilityId("Accessibility Node Querying");
    private By conquerWorld_checkBox = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox");


    public AccessibilityNodeQueryingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccessibilityNodeProviderText() {
        return driver.findElement(accessibilityNodeQuery_locator).getText();
    }

    public CheckBoxPage clickOnConquerWorld_checkBox() {
        driver.findElement(conquerWorld_checkBox).click();
        return new CheckBoxPage(driver);
    }
}
