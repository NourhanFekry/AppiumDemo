package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupPage {
    WebDriver driver;
    private By lunch_Button = AppiumBy.accessibilityId("Lunch");

    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkLunchButton() {

        return driver.findElement(lunch_Button).getAttribute("checked");
    }
}
