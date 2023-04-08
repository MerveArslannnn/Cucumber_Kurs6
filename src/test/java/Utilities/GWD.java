package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    //her 1 threde özel lokal static driver oluşturduk.
    private static ThreadLocal<WebDriver> theadDriver=new ThreadLocal<>(); //webDriver 1,2 vs gibi
    private static ThreadLocal<String>threadBrowserName=new ThreadLocal<>();//chrome,firefox

    //threadDriver.get()---->bulunduğum thread deki driver a ver
    public static WebDriver getDriver()
    {
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (threadBrowserName.get()==null)
            threadBrowserName.set("chrome");
        if (theadDriver.get() == null) { // 1 kere çalışssın
            switch (threadBrowserName.get())
            {
                case "firefox":
                    theadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    theadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    theadDriver.set(new EdgeDriver());
                    break;

                default:
            //chrome için
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            theadDriver.set(new ChromeDriver(options));
            break;
            }
        }
        theadDriver.get().manage().window().maximize();
        return theadDriver.get();
    }

    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (theadDriver.get() != null) { // dolu ise, boş değilse
            theadDriver.get().quit();
            WebDriver driver=theadDriver.get();
            driver=null;
            theadDriver.set(driver);
        }
    }

    public static void threadBrowserSet(String browser){
        threadBrowserName.set(browser);
    }

 //  public static void threadBrowserGet(String browser){
 //      threadBrowserName.set(browser);
 //  }--> set le çalışmazsa bunu da kullanabiliriz



    public static String threadBrowserGet(){
        return threadBrowserName.get();
    }

}

