package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsPage {
    private By SCALE_TO_FIT_BTN = AppiumBy.accessibilityId("ScaleToFit");
    private By VERTICES = AppiumBy.accessibilityId("Vertices");
    private WebDriver driver;
    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
    }
    public ScaleToFitPage clickOnScaleToFitPageBTN() {
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(SCALE_TO_FIT_BTN).click();
        return new ScaleToFitPage(driver);
    }
    public VerticesPage clickOnVerticesBTN() {
        MobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(VERTICES).click();
        return new VerticesPage(driver);
    }
}
