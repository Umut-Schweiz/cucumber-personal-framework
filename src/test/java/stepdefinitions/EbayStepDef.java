package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;

public class EbayStepDef {

    EbayPage ebayPage = new EbayPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {

        Driver.getDriver().get(string);

    }

    @Given("kullanici aramaKutusuna {string} yazar")
    public void kullanici_aramaKutusuna_yazar(String string) {

        ebayPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici sonucsayisini ekrana yazar")
    public void kullanici_sonucsayisini_ekrana_yazar() {

        String sonucSayisi = ebayPage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
    }

}
