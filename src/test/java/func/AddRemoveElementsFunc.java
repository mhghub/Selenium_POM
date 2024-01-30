package func;

import locators.AddRemoveElementsLoc;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsFunc {

    AddRemoveElementsLoc addRemoveElementsLoc;

    public AddRemoveElementsFunc(WebDriver driver){
        addRemoveElementsLoc = new AddRemoveElementsLoc(driver);
    }

    public void clickAddElementButton(int c){

        for(int i=0; i<c; i++) {
            addRemoveElementsLoc.getButton().click();
        }
    }

    public void clickDeleteElementButton(int d){

        for (int i=0; i<d; i++) {
            addRemoveElementsLoc.deleteElement().click();
        }
    }
}
