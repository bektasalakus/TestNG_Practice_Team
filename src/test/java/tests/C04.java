package tests;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethod;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;

public class C04 {

    @Test
    public void facebookTest(){
        FacebookPage facebookPage = new FacebookPage();
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Faker faker = new Faker();
        facebookPage.EmailKutusu.sendKeys("ads"+faker.internet().emailAddress());
        facebookPage.SıfreKutusu.sendKeys(faker.internet().password());
        ReusableMethod.sleep(2);
        facebookPage.LoginButonu.click();
        Assert.assertTrue(facebookPage.GirisYapilamadiElementi.isDisplayed());


     Driver.quitDriver();

    }
}
