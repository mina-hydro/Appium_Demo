package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage {
    private By ACTIVITY_BTN = new AppiumBy.ByAccessibilityId("Activity");
    WebDriver driver;
    public AppPage(WebDriver driver) {
        this.driver = driver;
    }
    public ActivityPage clickOnActivityBTN() {
        driver.findElement(new AppiumBy.ByAccessibilityId("Activity")).click();
        return new ActivityPage(driver);
    }
}
