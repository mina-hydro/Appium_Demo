package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityPage {
    private By ACCESSIBILITY_NODE_BTN = new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    private By NODE_QUERY_BTN = new AppiumBy.ByAccessibilityId("Accessibility Node Querying");
    private WebDriver driver;
    public AccessibilityPage(WebDriver driver) {
        this.driver = driver;
    }
    public Boolean checkAccessibilityNodeProviderBTNExists() {
        return driver.findElement(ACCESSIBILITY_NODE_BTN).getText().contains("Accessibility Node Provider");
    }
    public NodeQueryPage clickOnNodeQueryBTN() {
        driver.findElement(NODE_QUERY_BTN).click();
        return new NodeQueryPage(driver);
    }
}
