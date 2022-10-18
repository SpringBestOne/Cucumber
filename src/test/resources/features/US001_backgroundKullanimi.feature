@Background
Feature: US001 Backround Kullanimi

  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazon'da nutella aratir

    Then Kullanici nutella icin arama yapar
    And sonuclarin nutella icerdigini test eder

  Scenario: TC02 Kullanici amazon'da Selenium aratir

    Then Kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanici amazon'da iphone aratir

    Then Kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir