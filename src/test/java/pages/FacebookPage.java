package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement EmailKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement SıfreKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement LoginButonu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement GirisYapilamadiElementi;



}
