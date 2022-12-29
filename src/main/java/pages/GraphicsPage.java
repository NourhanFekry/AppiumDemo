package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GraphicsPage {
    WebDriver driver;
    MobileActions mobileActions;
    private By graphics_Button = AppiumBy.accessibilityId("Graphics");
    private By scaleToFit_Button = AppiumBy.accessibilityId("ScaleToFit");

    private By topTitle_text = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");

    private By verticesButton = AppiumBy.accessibilityId("Vertices");
    private By verticesImage_Locator = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View");

    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
        new MobileActions(driver);
    }

    public GraphicsPage clickOnScaleToFitButton() {
        mobileActions = new MobileActions(driver);
        MobileActions.scrollDownToSpecificTextContained("ScaleToFit");
        driver.findElement(scaleToFit_Button).click();
        return this;
    }

    public String getTopTitleText() {
        return driver.findElement(topTitle_text).getText();
    }

    public VerticesPage clickOnVerticesButton() {
        mobileActions = new MobileActions(driver);
        MobileActions.scrollDownToSpecificTextContained("Vertices");
        driver.findElement(verticesButton).click();
        return new VerticesPage(driver);
    }

}
