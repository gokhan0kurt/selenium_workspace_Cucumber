Feature: 1003 Kullanici Parametre ile testlerini yapar


  Scenario: TC03 Amazon Nutella Arama Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    Then  "Nutella" icin arama yapar
    Then  Arama sonuclarinin "Nutella" icerdigini test eder
    And   Sayfayi kapatir



  Scenario: TC04 Amazon Java Arama Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    Then  "Java" icin arama yapar
    Then  Arama sonuclarinin "Java" icerdigini test eder
    And   Sayfayi kapatir


  Scenario: TC05 Amazon Samsung Arama Testi

    Given Kullanici "amazonUrl" anasayfaya gider
    Then  "Samsung" icin arama yapar
    Then  Arama sonuclarinin "Samsung" icerdigini test eder
    And   Sayfayi kapatir