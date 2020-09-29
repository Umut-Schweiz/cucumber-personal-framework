package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPage {

    public EbayPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy ( id = "gh-ac" )
    public WebElement aramaKutusu;

    @FindBy ( className = "srp-controls__count-heading")
    public WebElement sonucSayisi;


}
