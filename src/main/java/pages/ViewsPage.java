package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;
    MobileActions mobileActions;
    private By radioGroup_Button = AppiumBy.accessibilityId("Radio Group");


    public ViewsPage(WebDriver driver) {
        this.driver = driver;
        new MobileActions(driver);
    }

    public ViewsPage clickOnRadioGroupButton() {
        mobileActions = new MobileActions(driver);
        MobileActions.scrollDownToSpecificTextContained("Radio Group");
        driver.findElement(radioGroup_Button).click();
        return this;
    }

}
