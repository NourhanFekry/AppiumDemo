package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AccessibilityPage {
    WebDriver driver;

    private By accessibility_locator = AppiumBy.accessibilityId("Access'ibility");
    private By accessibilityNodeQuery_Button = AppiumBy.accessibilityId("Accessibility Node Querying");
    public AccessibilityPage(WebDriver driver) {
        this.driver = driver;
    }

    public AccessibilityNodeQueryingPage clickOnAccessibility() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(accessibility_locator).click();
        return new AccessibilityNodeQueryingPage(driver);
    }

    public CheckBoxPage clickOnAccessibilityNodeQuery() {
        driver.findElement(accessibilityNodeQuery_Button).click();
        return new CheckBoxPage(driver);
    }
}
