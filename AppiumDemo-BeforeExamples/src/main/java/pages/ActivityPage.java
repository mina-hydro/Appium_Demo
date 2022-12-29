package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    private By CUSTOM_TITLE_BTN = new AppiumBy.ByAccessibilityId("Custom Title");
    private WebDriver driver;
    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }
    public CustomTitlePage clickOnCustomTitleBTN() {
        driver.findElement(new AppiumBy.ByAccessibilityId("Custom Title")).click();
        return new CustomTitlePage(driver);
    }
}
