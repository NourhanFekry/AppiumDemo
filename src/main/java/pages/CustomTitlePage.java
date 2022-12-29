package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    WebDriver driver;
    private By customTittle_Button = AppiumBy.accessibilityId("Custom Title");

    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }

    public TypePage clickOnCustomTitleButton() {
        driver.findElement(customTittle_Button).click();
        return new TypePage(driver);
    }

}
