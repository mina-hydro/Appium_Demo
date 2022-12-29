package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScaleToFitPage {
    private By TOP_TITLE = By.xpath("//android.widget.TextView[@text=\"Graphics/ScaleToFit\"]");
    private WebDriver driver;
    public ScaleToFitPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTopTitleText() {
        return driver.findElement(TOP_TITLE).getText();
    }
}
