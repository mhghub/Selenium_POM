package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import sun.lwawt.macosx.CSystemTray;

public class EntryAdLoc {

    private WebDriver driver;

    private String actualCloseText;

    public EntryAdLoc(WebDriver driver){
        this.driver = driver;
    }

    public WebElement closeModal(){

        return driver.findElement(By.className("modal-footer"));
    }
    public WebElement reEnable(){
        return driver.findElement(By.id("restart-ad"));
    }
}







//        actualCloseText = driver.findElement(By.cssSelector(".modal-footer p")).getText();
//        Assert.assertEquals("Close", actualCloseText);
//        System.out.println("Close text is passed...!");