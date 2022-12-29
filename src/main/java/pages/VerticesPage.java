package pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VerticesPage {
    WebDriver driver;
    MobileActions mobileActions;
    private By verticesImage_Locator = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View");


    public VerticesPage(WebDriver driver) {
        this.driver = driver;
        new MobileActions(driver);
    }

    public VerticesPage swipeImageRight() {
        mobileActions = new MobileActions(driver);
        MobileActions.swipeRightOnElement(verticesImage_Locator, driver);
        return this;
    }

    public VerticesPage swipeImageLeft() {
        mobileActions = new MobileActions(driver);
        MobileActions.swipeLeftOnElement(verticesImage_Locator);
        return this;
    }

}
