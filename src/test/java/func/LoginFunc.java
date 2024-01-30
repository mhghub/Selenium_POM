package func;

import locators.EntryAdLoc;
import locators.LoginLoc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class LoginFunc {

    LoginLoc loginLoc;
    private String successMsg;

    public LoginFunc(WebDriver driver){
        loginLoc = new LoginLoc(driver);
    }

    public void enterUsername(String username)
    {
        loginLoc.username().sendKeys(username);
    }

    public  void enterPassword(String password){
        loginLoc.password().sendKeys(password);
    }

    public void clickLoginButton(){
        loginLoc.loginButton().click();
    }

    public void checkVerifyLogin(){
        successMsg = loginLoc.verifyLogin().getText();
        System.out.println("Success Msg:" + successMsg);
        Assert.assertEquals(" You logged into a secure area!", successMsg);
    }
}
