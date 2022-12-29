package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    private By left_text_edit_TEXT_BOX = By.id("left_text_edit");
    private By CHANGE_LEFT_BTN = new AppiumBy.ByAccessibilityId("Change Left");
    private By LEFT_TEXT = By.id("left_text");
    private WebDriver driver;
    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }
    public CustomTitlePage typeOnLeftTextEditor(String text) {
        driver.findElement(By.id("left_text_edit")).clear();
        driver.findElement(By.id("left_text_edit")).sendKeys(text);
        return this;
    }
    public String getTextOnTextBox() {
       return driver.findElement(LEFT_TEXT).getText();
    }
    public CustomTitlePage clickOnChangeLeft() {
        driver.findElement(CHANGE_LEFT_BTN).click();
        return this;
    }
    public String getLeftText() {
        return driver.findElement(LEFT_TEXT).getText();
    }
}
