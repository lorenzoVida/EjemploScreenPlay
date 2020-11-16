package actions;

import org.openqa.selenium.WebDriver;

public class visit {

    private WebDriver driver;

    public visit(WebDriver driver) {
        this.driver = driver;
    }

    public void visitPage(String url){
        driver.get(url);
    }
}
