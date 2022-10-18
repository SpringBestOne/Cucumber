Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "amzUrl" sayfasina gider
    Then  kullanici 3 saniye bekler
    When Url'nin "amazon" icerdigini test edelim
    And sayfayi kapatir
