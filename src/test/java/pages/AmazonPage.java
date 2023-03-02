package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {


   public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[6]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement urunİsim;


}
