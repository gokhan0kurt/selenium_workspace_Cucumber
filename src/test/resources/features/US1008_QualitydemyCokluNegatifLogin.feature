Feature: US1008 Toplu kullanici ve sifre listesi ile negatif login testi

  @wip
  Scenario Outline: TC14 Kullanici listedeki bilgiler ile giris yapamadigini test eder


    Given Kullanici "qdUrl" anasayfaya gider
    When Ilk login butonuna tiklar
    Then user email olarak "<email>" girer
    Then password olarak "<password>" girer
    Then 2 saniye bekler
    Then Login butonuna basar
    Then Login butonunun hala gorunur oldugunu dogrular
    Then 1 saniye bekler
    And  Sayfayi kapatir




    Examples:
      | email                | password   |
      | asdand@gmail.com     | 12312312.  |
      | qweqs123@hotmail.com | asdq12**   |
      | dhhadn123.com        | sdaskw123. |

