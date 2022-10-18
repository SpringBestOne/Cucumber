package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@web",  //iki grubu aynı anda calistirmak istersek @gp1 or @gp2 yapariz
        dryRun =false  //true yaparsak sayfayı acmadan kodları calistirir. Syntex hatasını görmez
)

public class Runner {
    /*
    Runner celassı test ng deki xml mantığı ile calışır calıştırmak istediğiiz senatyolara tag belirtiriz
    ve belirttiğimiz tagları calistirir. XML deki gibi istediğimiz testleri calistirmak icin kullanırız
     Runner class body si bostur ve runner classını ekleyeceğimiz notasyonlar aktive eder...
     bu clasımızda 2 adet notasyon vardır.
     @RunWith(Cucumber.class) notasyonu runner clasına calısma ozelliği ekler
     bu notasyon olduğu icin Cucumber frameworkumuzda Junit kullanmayı tercih ederiz.
    @CucumberOptions notasyonu içide
    features: Runner dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : hangi tagı calistirmak istiyorsak onu belli eder

    dryRun iki secenek vardir
    dryRun=true; dersek testimizi calistirmadan eksik adımlari bize verir
    dryRun=false; testlerimizi driver ile calistirir.
     */
}