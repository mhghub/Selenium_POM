package locators;

import org.junit.Assert;
import org.openqa.selenium.*;

public class AddRemoveElementsLoc {

    private WebDriver driver;

    private String actualAddButtonText;
    private String actualDeleteButtonText;

    public AddRemoveElementsLoc( WebDriver driver){
        this.driver = driver;
    }

    public WebElement getButton(){
        actualAddButtonText = driver.findElement(By.cssSelector("button")).getText();

        Assert.assertEquals("Add Element", actualAddButtonText);
        return driver.findElement(By.cssSelector("button"));
    }

    public WebElement deleteElement(){
        actualDeleteButtonText = driver.findElement(By.className("added-manually")).getText();

        Assert.assertEquals("Delete", actualDeleteButtonText);
        return driver.findElement(By.className("added-manually"));
    }

}
