package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NodeQueryPage {
    private By CHECK_BOX = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");
    private WebDriver driver;
    public NodeQueryPage(WebDriver driver) {
        this.driver = driver;
    }
    public NodeQueryPage checkBox() {
        driver.findElement(CHECK_BOX).click();
        return this;
    }
    public Boolean checkIfTheBoxIsChecked() {
        return driver.findElement(CHECK_BOX).getAttribute("checked").contains("true");
    }
}
