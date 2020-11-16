package actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverConnection {

    private WebDriver driver;

    public chromeDriverConnection(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
