#//- Google'a gidiniz
#//- trendyol'u aratınız
#//- trendyol linkini bulup siteye gidiniz
#//- makas aratınız
#//- toplam ürün sayısını alınız
#//- yeni sekmede morhipo'ya gidiniz
#//- makas aratınız
#//- toplam ürün sayısını alınız
#//- iki sitedeki toplam makas sayısını karşılaştırınız
#//- Önce ürün sayısı fazla olan siteyi kapatınız
#//- Sonra diğer sayfayıda kapatınız

  Feature: Trendyol search
    Scenario: trendyol ve morhipo sitelerinde urun arama
      Given kullanici google gider
      When trendyol'u aratiniz
      And trendyol linkini bulup siteye gidiniz
      And makas aratiniz
      And toplam urun sayisini aliniz
      And yeni sekmede morhipo'ya gidiniz
      And makas aratiniz
      And toplam ürün sayisini aliniz
      And iki sitedeki toplam makas sayisini karsilastirin
      And once urun sayisi fazla olan siteyi kapatin
      And Sonra diger sayfayida kapatin