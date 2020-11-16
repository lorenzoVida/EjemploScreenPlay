package test;

import actions.chromeDriverConnection;
import actions.visit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import task.login;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class demoTest {

    private WebDriver driver;
    login loginTest;
    visit visitGo;
    chromeDriverConnection chrome;

    @BeforeTest
    public void setUp(){
        chrome = new chromeDriverConnection(driver);
        driver = chrome.chromeDriver();
        visitGo = new visit(driver);
        visitGo.visitPage("https://www.espn.com/?src=com&amp;_adblock=true");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void login(){
        System.out.println("llegamos aquí");
        loginTest = new login(driver);
        loginTest.login();
    }

}
