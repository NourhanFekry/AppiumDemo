package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxPage {
    WebDriver driver;

    private By conquerWorld_checkBox = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox");

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public AccessibilityNodeQueryingPage clickOnConquerWorld_checkBox() {
        driver.findElement(conquerWorld_checkBox).click();
        return new AccessibilityNodeQueryingPage(driver);
    }

    public String checkConquerWorld() {
        return driver.findElement(conquerWorld_checkBox).getAttribute("checked");

    }


}