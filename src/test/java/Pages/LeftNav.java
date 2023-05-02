package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;
    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;
    @FindBy(xpath = "//span[text()='Nationalities']")
     private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamOne;
    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;
    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamTwo;






    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citizenShip" : return citizenShip;
            case "nationalities" : return nationalities;
            case "fees" : return fees;
            case "entranceExamOne" : return entranceExamOne;
            case "setupTwo" : return setupTwo;
            case "entranceExamTwo" : return entranceExamTwo;
            case "states" : return states;

        }

        return null;
    }

}
