Feature: US1006 Kullanici Hatali bilgilerle giris yapamaz

  Scenario: TC02 Gecerli mail Gecersiz sifre Negatif Login

    Given Kullanici "qdUrl" anasayfaya gider
    Then  Ilk login butonuna tiklar
    When  Gecerli email adresini email kutusuna girer
    Then  Gecersiz sifreyi password kutusuna girer
    Then  2 saniye bekler
    Then  Login butonuna basar
    Then  Login butonunun hala gorunur oldugunu dogrular
    Then  2 saniye bekler
    And   Sayfayi kapatir

  Scenario: TC03 Gecersiz mail Gecerli sifre Negatif Login

    Given Kullanici "qdUrl" anasayfaya gider
    Then  Ilk login butonuna tiklar
    When  Gecersiz email adresini email kutusuna girer
    Then  Gecerli sifre'yi password kutusuna girer
    Then  2 saniye bekler
    Then  Login butonuna basar
    Then  Login butonunun hala gorunur oldugunu dogrular
    Then  2 saniye bekler
    And   Sayfayi kapatir