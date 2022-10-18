package stepDefinitions;

import Pages.GuruPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class GuruStep {

    GuruPage guruPage=new GuruPage();


    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String guruUrl) {
        Driver.getDriver().get(guruUrl);

    }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String thead) {

        int index =0;
        for (int i = 0; i < guruPage.theads.size(); i++) {
            if(guruPage.theads.get(i).getText().equals(thead)){
                System.out.println(guruPage.theads.get(i).getText());
                index=i+1;
                List<WebElement> sutunElement=
                        Driver.getDriver().findElements(By.xpath("//tbody//tr/td["+index+"]"));
                //Sonrasında webTable'daki body'i locate edip eşitlediğimiz index'i başlık altındaki sutunu getirebilmesi için bu liste koyduk.
                        sutunElement.forEach(t-> System.out.println(t.getText()));
                //Lambda ilede o sutunu yazdırdık
                //for (WebElement w:sutunElement) {
                //    System.out.println(w.getText());
                //}
            }

        }


    }
}
