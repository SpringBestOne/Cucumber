Feature: US002 Parametre Kullanimi
  Background: ortak adim
Given kullanici amazon sayfasina gider
  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then kullanici Selenium icin arama yapar
    And sonuclarin "selenium" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC03 Kullanici amazonda parametreli arama yapar

    Then kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder
    And sayfayi kapatir

# feature dosyasında parametreli bir arama yaptığımızda " " içerisine aldığımız string değeri stepDefinition da
  # bir kere parammetreli method olusturur ve yeni bir arama yapmak istediğimizde tekrar method olusturadan
  #feature dosyasından " " icinde belirttiğimiz string ifadeyi degistirmemiz yeterli olacaktır. Boylece kodlarimiz
  # dinamik olacaktir.ayfayi kapatir