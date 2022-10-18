package stepDefinitions;
import Pages.AmazonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import utilities.ConfigReader;
import utilities.Driver;
public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
    @Then("kullanici Selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);
    }
    @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime="Selenium";
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }
    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime="iphone";
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("java" + Keys.ENTER);
    }
    @And("sonuclarin java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String arananKelime="java";
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici samsung icin arama yapar")
    public void kullaniciSamsungIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("samsung" + Keys.ENTER);
    }
    @And("sonuclarin samsung icerdigini test eder")
    public void sonuclarinSamsungIcerdiginiTestEder() {
        String arananKelime="samsung";
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici SQL icin arama yapar")
    public void kullaniciSQLIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("SQL" + Keys.ENTER);
    }
    @And("sonuclarin SQL icerdigini test eder")
    public void sonuclarinSQLIcerdiginiTestEder() {
        String arananKelime="SQL";
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }
    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr= amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @When("Url'nin {string} icerdigini test edelim")
    public void urlNinIcerdiginiTestEdelim(String istenenUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}