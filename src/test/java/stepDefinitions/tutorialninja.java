package stepDefinitions;

import Pages.TutorialninjaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.*;

public class tutorialninja {

    TutorialninjaPage tutorialninjaPage=new TutorialninjaPage();
    List<String > telMarkaListi=new ArrayList<String>();
    List <String >sepetListesi=new ArrayList<String>();

    @Given(":  Kullanici http:\\/\\/tutorialsninja.com\\/demo\\/index.php?route=common\\/home sayfasina gider")
    public void kullaniciHttpTutorialsninjaComDemoIndexPhpRouteCommonHomeSayfasinaGider() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @Then(": Kullanici Phones & PDAs'a tiklar")
    public void kullaniciPhonesPDAsATiklar() {
        tutorialninjaPage.phonePdaTik.click();
    }

    @And(": Kullanici telefonlarin markalarini alir")
    public void kullaniciTelefonlarinMarkalariniAlir() {
        for (WebElement w:tutorialninjaPage.tlfnMarkalari) {
            telMarkaListi.add(w.getText());
        }
    }

    @And(": Kullanici tum ogeleri sepete ekler")
    public void kullaniciTumogeleriSepeteEkler() {

        for (WebElement w:tutorialninjaPage.sepeteEklenecekler) {
            w.click();

        }

    }

    @And(": Kullanici Sepete tiklar")
    public void kullaniciSepeteTiklar() throws InterruptedException {
        Thread.sleep(2000);
        tutorialninjaPage.sepetTik.click();
    }

    @And(": Kullanici Sepetteki isimleri alir")
    public void kullaniciSepettekiIsimleriAlir() {

        for (WebElement w:tutorialninjaPage.sepettekiIsimler) {
            sepetListesi.add(w.getText());


        }
    }

       @And(": Kullanici Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir")
    public void kullaniciSepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastirir() throws InterruptedException {
           Collections.sort(telMarkaListi);
           Collections.sort(sepetListesi);

           Thread.sleep(2000);
        Assert.assertTrue(sepetListesi.containsAll(telMarkaListi));
    }
    @And(": Sayfayi kapatir")
    public void sayfayiKapatir() {
    }
}
