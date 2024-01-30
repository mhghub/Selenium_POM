package func;

import locators.EntryAdLoc;
import org.openqa.selenium.WebDriver;

public class EntryAdFunc {

    EntryAdLoc entryAdLoc;

    public EntryAdFunc(WebDriver driver){
        entryAdLoc = new EntryAdLoc(driver);
    }

    public void clickCloseModal(){
        entryAdLoc.closeModal().click();

    }

    public  void clickReEnable(){
        entryAdLoc.reEnable().click();
    }
}
