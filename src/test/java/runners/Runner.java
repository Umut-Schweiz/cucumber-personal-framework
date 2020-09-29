package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // senaryolarimizi calistirabilmek icin..
@CucumberOptions (

        plugin = {"html:target/default-cucumber-reports"},//html formatinda rapor olusturmak icin..
        features = "src/test/resources/features",//senaryolarimiz icerisinde bulundugu "features" klasorunun adresi..
        glue = "stepdefinitions" ,  //test adimlarimizin methodlarinin icersinde bulundugu paketin adi//
        tags = "@ebay" ,// calistirmak istedigimiz "feature" ya da "senaryo" nun @tag ismini yaziyoruz..
        dryRun = false // senaryolarimizin icersindeki adimlara ait herhangi bir eksik method varsa, bu methodlari
                      // konsoldan kopyalayabilmek icin , dryRun =true yaziyoruz

                      // eger dryRun = false derseniz, bu durumda direk testinizi calistirir.


)

public class Runner {
}
