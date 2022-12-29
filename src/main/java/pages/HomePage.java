package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private By app_Button = AppiumBy.accessibilityId("App");
    private By accessibility_locator = AppiumBy.accessibilityId("Access'ibility");

    private By graphics_Button = AppiumBy.accessibilityId("Graphics");
    private By views_Button = AppiumBy.accessibilityId("Views");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ActivityPage clickOnAppButton() {
        driver.findElement(app_Button).click();
        return new ActivityPage(driver);
    }

    public AccessibilityPage clickOnAccessibilityButton() {
        driver.findElement(accessibility_locator).click();
        return new AccessibilityPage(driver);
    }

    public GraphicsPage clickOnGraphicsButton() {
        driver.findElement(graphics_Button).click();
        return new GraphicsPage(driver);
    }

    public ViewsPage clickOnViewsButton() {
        driver.findElement(views_Button).click();
        return new ViewsPage(driver);
    }
}
