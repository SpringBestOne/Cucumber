@tumu
Feature: Parametre Kullanimi
  @gp1
  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "faceUrl" sayfasina gider
    Then  kullanici 3 saniye bekler
    When Url'nin "face" icerdigini test edelim
    And sayfayi kapatir
@gp2
  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "google" sayfasina gider
    Then  kullanici 3 saniye bekler
    When Url'nin "google" icerdigini test edelim
    And sayfayi kapatir
@gp1
  Scenario: TC03 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "brcUrl" sayfasina gider
    Then  kullanici 3 saniye bekler
    When Url'nin "blue" icerdigini test edelim
    And sayfayi kapatir
@gp2
  Scenario: TC03 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "amzUrl" sayfasina gider
    Then  kullanici 3 saniye bekler
    When Url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir