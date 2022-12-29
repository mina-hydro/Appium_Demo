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

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        new MobileActions(driver);
    }

    @Test
    public void testClickAction() {
        AccessibilityPage accessibilityPage = new HomePage(driver).clickOnAccessibility();
        Assert.assertTrue(accessibilityPage.checkAccessibilityNodeProviderBTNExists());
    }

    @Test(dependsOnMethods = "testClickAction")
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        CustomTitlePage customTitlePage = new HomePage(driver)
                .clickOnApp()
                .clickOnActivityBTN().
                clickOnCustomTitleBTN();
        customTitlePage.typeOnLeftTextEditor("appium").clickOnChangeLeft();
        Assert.assertEquals(customTitlePage.getTextOnTextBox(), "appium");
        customTitlePage.clickOnChangeLeft();
        Assert.assertEquals(customTitlePage.getLeftText(), "appium");
    }

    @Test(dependsOnMethods = "testTyping")
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        NodeQueryPage nodeQueryPage = new HomePage(driver).clickOnAccessibility().clickOnNodeQueryBTN();
        nodeQueryPage.checkBox();
        Assert.assertTrue(nodeQueryPage.checkIfTheBoxIsChecked());
    }

    @Test(dependsOnMethods = "testCheckBox")
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        ScaleToFitPage scaleToFitPage = new HomePage(driver).clickOnGraphics().clickOnScaleToFitPageBTN();
        Assert.assertEquals(scaleToFitPage.getTopTitleText(), "Graphics/ScaleToFit");
    }
    @Test(dependsOnMethods = "testScrolling")
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver)
                .clickOnGraphics()
                .clickOnVerticesBTN()
                .swipePhotoLeft()
                .swipePhotoToRight();

    }
    @Test(dependsOnMethods = "testSwiping")
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        RadioGroupsPage radioGroupsPage = new HomePage(driver)
                .clickOnViews()
                .clickOnRadioGroups()
                .clickOnRadioBTN();
        Assert.assertTrue(radioGroupsPage.checkRadioBTNIsChecked());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
