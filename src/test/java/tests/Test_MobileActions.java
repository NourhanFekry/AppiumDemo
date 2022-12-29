package tests;

import Actions.MobileActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_MobileActions {
    WebDriver driver;
    MobileActions mobileActions;

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Android SDK built for x86");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
    }

    @Test
    public void testClickAction() {
        String accessibilityNodeProvider_Text = new AccessibilityPage(driver)
                .clickOnAccessibility()
                .getAccessibilityNodeProviderText();
        Assert.assertEquals(accessibilityNodeProvider_Text, "Accessibility Node Provider");
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver)
                .clickOnAppButton()
                .clickOnActivityButton()
                .clickOnCustomTitleButton()
                .clearLeftTextEdit()
                .setTextLeftTextEdit()
                .clickOnChangeLeftButton();
        String topBarText = new TypePage(driver).getTopBarText();
        Assert.assertEquals(topBarText, "Appium");
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver)
                .clickOnAccessibilityButton()
                .clickOnAccessibilityNodeQuery()
                .clickOnConquerWorld_checkBox()
                .clickOnConquerWorld_checkBox();
        String isChecked = new CheckBoxPage(driver).checkConquerWorld();
        Assert.assertEquals(isChecked, "false");
    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        new HomePage(driver)
                .clickOnGraphicsButton()
                .clickOnScaleToFitButton();
        String topTitleText = new GraphicsPage(driver).getTopTitleText();
        Assert.assertEquals(topTitleText, "Graphics/ScaleToFit");
    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver)
                .clickOnGraphicsButton()
                .clickOnVerticesButton()
                .swipeImageRight()
                .swipeImageRight();
    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver)
                .clickOnViewsButton()
                .clickOnRadioGroupButton();
        String isChecked = new RadioGroupPage(driver).checkLunchButton();
        Assert.assertEquals(isChecked, "true");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
