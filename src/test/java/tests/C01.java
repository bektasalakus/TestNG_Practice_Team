package tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C01 {

    @Test
    public void amazonTesti(){


        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expected ="amazon";
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));











        Driver.quitDriver();




    }

}
