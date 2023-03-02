package tests;

import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02 {


    @Test
    public void wisetest() throws InterruptedException {

        Driver.getDriver().get("https://www.wisequarter.com");

        Thread.sleep(2000);

        Driver.getDriver().navigate().refresh();

        String expected = "wisequarter";
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));

        Driver.quitDriver();

    }


}
