package stepdef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends config {
    public static String url;
    public static String envType =System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                url = "https://qa.taltektc.com";
                break;
            case "stage":
                url = "https://stage.taltektc.com";
                break;
            case "prod":
                url = "https://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }
    @After
    public void afterEachTest(){
        // close browser
        // quit browser
        // take screenshot if test steps or case fail
        // close db connection
    }
}
