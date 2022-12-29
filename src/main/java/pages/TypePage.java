package pages;

import com.github.jaiimageio.impl.common.PackageUtil;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypePage {
    WebDriver driver;
    private By leftTextEdit_EditText = By.id("io.appium.android.apis:id/left_text_edit");
    private By changeLeft_Button = AppiumBy.accessibilityId("Change Left");
    private By topBarText = By.id("io.appium.android.apis:id/left_text");

    public TypePage(WebDriver driver) {
        this.driver = driver;
    }

    public TypePage clearLeftTextEdit() {
        driver.findElement(leftTextEdit_EditText).clear();
        return this;
    }

    public TypePage setTextLeftTextEdit() {
        driver.findElement(leftTextEdit_EditText).sendKeys("Appium");
        return this;
    }

    public TypePage clickOnChangeLeftButton() {
        driver.findElement(changeLeft_Button).click();
        return this;
    }

    public String getTopBarText() {
        return driver.findElement(topBarText).getText();
    }
}
