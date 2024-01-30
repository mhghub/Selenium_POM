package test;

import func.AddRemoveElementsFunc;
import func.EntryAdFunc;
import func.LoginFunc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCases {

    private WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testAddRemoveElements() {
        // Navigate to the specific URL for this test
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        AddRemoveElementsFunc addRemoveElementsFunc = new AddRemoveElementsFunc(driver);
        addRemoveElementsFunc.clickAddElementButton(3);
        addRemoveElementsFunc.clickDeleteElementButton(2);
    }

    @Test
    public void testEntryAd() {
        // Navigate to the specific URL for this test
        driver.get("https://the-internet.herokuapp.com/entry_ad");
        EntryAdFunc entryAdFunc = new EntryAdFunc(driver);
       // entryAdFunc.clickCloseModal(); //ok then add wait after both steps for 5 seconds right.
        entryAdFunc.clickReEnable();
    }

    @Test
    public void testLogin(){
        driver.get("https://the-internet.herokuapp.com/login"); // Replace with the actual URL
        LoginFunc loginFunc = new LoginFunc(driver);
        loginFunc.enterUsername("tomsmith");
        loginFunc.enterPassword("SuperSecretPassword!");
        loginFunc.clickLoginButton();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
