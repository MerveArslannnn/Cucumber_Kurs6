package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After  // her senaryodan sonra çalışacak bölüm
    public void after(Scenario senaryo){
        System.out.println("Senaryo bitti");
        ExcelUtility.writeExcel("src/test/java/ApachePOI/resource/ScenarioStatus.xlsx",senaryo,GWD.threadBrowserGet());

        if (senaryo.isFailed()){
           //Exdend reportta çalışan kısım resim eklemek istersek çalıştır
           TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
           final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
           senaryo.attach(hafizadakiHali, "image/png","screenshot name");
        }

        GWD.quitDriver();
    }

}
