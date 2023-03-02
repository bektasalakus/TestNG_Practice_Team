package tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C03 {
    AmazonPage amazonPage;
    @Test
    public void amazonTest(){

        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String expected = "Amazon";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));

    }


    @Test(dependsOnMethods = "amazonTest")
    public void nutellaTest(){

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        String expected = "nutella";
        String actual = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Test(dependsOnMethods = "nutellaTest")
    public void ilkurunTest(){

        amazonPage.ilkUrun.click();
        String expected = "Nutella";
        String actual = amazonPage.urunİsim.getText();
        Assert.assertTrue(actual.contains(expected));



Driver.quitDriver();

    }
}
