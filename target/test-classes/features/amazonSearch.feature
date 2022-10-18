@All
Feature: Amazon Search
  @gp1
  Scenario: TC01 Kullanici amazon'da nutella aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella icin arama yapar
    And sonuclarin nutella icerdigini test eder

  @gp3
  Scenario: TC02 Kullanici amazon'da Selenium aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder

  @gp2
  Scenario: TC03 Kullanici amazon'da Selenium aratir
    Given Kullanici amazon sayfasina gider
    Then Kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir