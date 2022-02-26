package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

public class US03StepDefinition {

    @Given("Kullanıcı www.amazon.com sayfasına gider")
    public void kullanıcı_www_amazon_com_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @Given("Kullanıcı All kategorisine tıklar")
    public void kullanıcı_all_kategorisine_tıklar() {

    }
    @Given("Kullanıcı {string} menusunu seçer")
    public void kullanıcı_menusunu_seçer(String string) {

    }
    @Then("Kullanıcı {int} kategori olduğunu assert eder")
    public void kullanıcı_kategori_olduğunu_assert_eder(Integer int1) {

    }

}
