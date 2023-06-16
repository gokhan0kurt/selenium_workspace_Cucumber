Feature: US1007 Amazonda Coklu Arama


  Scenario Outline: TC13 Kullanici Amazonda coklu arama yapar

    Given Kullanici "amazonUrl" anasayfaya gider
    When  "<aranacakUrun>" icin arama yapar
    Then  Arama sonuclarinin "<aranacakUrun>" icerdigini test eder
    And   Sayfayi kapatir


    Examples:
      | aranacakUrun |
      | Java         |
      | Python       |
      | Apple        |
