package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLoc {

    private WebDriver driver;
    public LoginLoc(WebDriver driver){
        this.driver = driver;

    }
    public WebElement username(){
        return driver.findElement(By.id("username"));
    }

    public WebElement password(){
        return driver.findElement(By.id("password"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.cssSelector("button"));
    }

    public WebElement verifyLogin(){
        return driver.findElement(By.cssSelector("#flash"));
    }
}
