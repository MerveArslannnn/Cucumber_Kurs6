package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _09_ApachePOISteps {
    DialogContent dc=new DialogContent();
    @When("User Create citizenship with ApachePoi")
    public void userCreateCitizenshipWithApacehPOI() {
        ArrayList< ArrayList<String> > tablo=
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2 (2).xlsx","testCitizen",2);

        for(ArrayList<String> satir: tablo){
            dc.clickFunction(dc.addButton);
            dc.sendKeysFunction(dc.nameInput,satir.get(0));
            dc.sendKeysFunction(dc.shortName,satir.get(1));
            dc.clickFunction(dc.saveButton);
            dc.verifyContainsTextFunction(dc.successMessage,"success");
        }
    }

    @Then("User Delete citizenship with ApachePoi")
    public void userDeleteCitizenshipWithApacehPOI() {
        ArrayList< ArrayList<String> > tablo=
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2 (2).xlsx","testCitizen",1);

        for(ArrayList<String> satir: tablo){
            dc.deleteItem(satir.get(0));
        }
    }
}
