package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupsPage {
    private By RADIO_BTN = AppiumBy.accessibilityId("Breakfast");
    private WebDriver driver;
    public RadioGroupsPage(WebDriver driver) {
        this.driver = driver;
    }
    public RadioGroupsPage clickOnRadioBTN() {
        driver.findElement(RADIO_BTN).click();
        return this;
    }
    public Boolean checkRadioBTNIsChecked() {
        return driver.findElement(RADIO_BTN).getAttribute("checked").equals("true");
    }
}
