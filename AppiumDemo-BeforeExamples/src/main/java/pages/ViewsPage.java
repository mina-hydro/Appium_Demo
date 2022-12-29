package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    private By RADIO_GROUPS_BTN = AppiumBy.accessibilityId("Radio Group");
    private WebDriver driver;
    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }
    public RadioGroupsPage clickOnRadioGroups() {
        MobileActions.scrollDownToSpecificText("Radio Group");
        driver.findElement(RADIO_GROUPS_BTN).click();
        return new RadioGroupsPage(driver);
    }
}
