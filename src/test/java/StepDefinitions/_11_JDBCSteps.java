package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send  The quary the database {string} and control match")
    public void sendTheQuaryTheDatabaseAndControlMatch(String sorgu) {
        //DB den gerekli bilgileri alalım
        ArrayList<ArrayList<String>> dbList= DBUtility.getListData(sorgu);
        DialogContent dc=new DialogContent();
        List<WebElement> UIList=dc.nameList;

        for (int i = 0; i < dbList.size(); i++) {
            System.out.print(dbList.get(i).get(1).trim());  // 0->1   1->ümraniye
            System.out.println("\t"+UIList.get(i).getText().trim());

            Assert.assertEquals(
                    dbList.get(i).get(1).trim(),
                    UIList.get(i).getText().trim()
            );
        }

    }
}
