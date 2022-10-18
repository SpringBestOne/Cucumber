#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız

  @tutorianalninja
  Feature: tutorialsninja
@gp2
    Scenario: enario: Kullanici http://tutorialsninja.com/demo/index.php?route=common/home sayfasina gider ve Phones & PDAs'a tıklar

  Given :  Kullanici http://tutorialsninja.com/demo/index.php?route=common/home sayfasina gider
  Then : Kullanici Phones & PDAs'a tiklar
      And : Kullanici telefonlarin markalarini alir
      And : Kullanici tum ogeleri sepete ekler
      And : Kullanici Sepete tiklar
      And : Kullanici Sepetteki isimleri alir
      And : Kullanici Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir
      And : Sayfayi kapatir