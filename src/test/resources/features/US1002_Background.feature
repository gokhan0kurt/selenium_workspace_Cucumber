Feature: 1002 Amazon Search Test with Background

Background: Go Amazon Web Page
  Given Kullanici Amazon anasayfaya gider


  Scenario: TC03 Amazon Nutella Arama Testi

    Then  Nutella icin arama yapar
    Then  Arama sonuclarinin Nutella icerdigini test eder
    And   Sayfayi kapatir



  Scenario: TC04 Amazon Java Arama Testi

    Then  Java icin arama yapar
    Then  Arama sonuclarinin Java icerdigini test eder
    And   Sayfayi kapatir


    Scenario: TC05 Amazon Samsung Arama Testi

      Then  Samsung icin arama yapar
      Then  Arama sonuclarinin Samsung icerdigini test eder
      And   Sayfayi kapatir