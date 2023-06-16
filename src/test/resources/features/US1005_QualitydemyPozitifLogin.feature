Feature: US1005 Kullanici gecerli mail ve sifre ile login olur

@smoke
  Scenario: TC01 Gecerli sifre ve mail ile login

    Given Kullanici "qdUrl" anasayfaya gider
    Then  Ilk login butonuna tiklar
    Then  Gecerli email adresini email kutusuna girer
    Then  Gecerli sifre'yi password kutusuna girer
    Then  2 saniye bekler
    And   Login butonuna basar
    Then  Basarili giris yaptigini dogrular
    And   Sayfayi kapatir