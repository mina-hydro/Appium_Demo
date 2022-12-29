package pages;

import Actions.MobileActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticesPage {
    private By MAIN_PHOTO = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.view.View");
    private WebDriver driver;
    public VerticesPage(WebDriver driver) {
        this.driver = driver;
    }
    public VerticesPage swipePhotoToRight() {
        MobileActions.swipeRightOnElement(MAIN_PHOTO,driver);
        return this;
    }
    public VerticesPage swipePhotoLeft() {
        MobileActions.swipeLeftOnElement(MAIN_PHOTO);
        return this;
    }
}
