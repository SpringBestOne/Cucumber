package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class HepsiBuradaStepDefinition {
    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @When("url'nin {string} icerdigini test edelim")
    public void urlNinIcerdiginiTestEdelim(String arananKelime) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(arananKelime));

    }}