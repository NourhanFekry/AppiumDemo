package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;
    private By activity_Button = AppiumBy.accessibilityId("Activity");

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomTitlePage clickOnActivityButton() {
        driver.findElement(activity_Button).click();
        return new CustomTitlePage(driver);
    }

}
