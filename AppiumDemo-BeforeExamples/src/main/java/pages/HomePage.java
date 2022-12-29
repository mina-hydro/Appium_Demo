package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By ACCESSIBILITY = AppiumBy.accessibilityId("Access'ibility");
    private By APP = AppiumBy.accessibilityId("App");
    private By GRAPHICS = AppiumBy.accessibilityId("Graphics");
    private By VIEWS = AppiumBy.accessibilityId("Views");
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public AccessibilityPage clickOnAccessibility() {
        driver.findElement(ACCESSIBILITY).click();
        return new AccessibilityPage(driver);
    }
    public AppPage clickOnApp() {
        driver.findElement(APP).click();
        return new AppPage(driver);
    }
    public GraphicsPage clickOnGraphics() {
        driver.findElement(GRAPHICS).click();
        return new GraphicsPage(driver);
    }
    public ViewsPage clickOnViews() {
        driver.findElement(VIEWS).click();
        return new ViewsPage(driver);
    }
}
