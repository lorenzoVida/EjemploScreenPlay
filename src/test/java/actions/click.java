package actions;

import ui.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class click {

    private WebDriver driver;

    public click(WebDriver driver) {
        this.driver = driver;
    }

    public void clicking(By locator){
        driver.findElement(locator).click();
    }


}
