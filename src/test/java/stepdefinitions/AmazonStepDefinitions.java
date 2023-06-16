package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty("amazonSearchWord") + Keys.ENTER);

    }

    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualResultContent = amazonPage.searchResult.getText();
        Assert.assertTrue(actualResultContent.contains(ConfigReader.getProperty("amazonExpectedContent")));

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }


    @When("Java icin arama yapar")
    public void javaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @Then("Arama soncularinin Java icerdigini test eder")
    public void aramaSoncularininJavaIcerdiginiTestEder() {
        String actualResultContent = amazonPage.searchResult.getText();
        String expectedContent = "Java";
        Assert.assertTrue(actualResultContent.contains(expectedContent));
    }

    @When("Samsung icin arama yapar")
    public void samsungIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Samsung" + Keys.ENTER);
    }


    @Then("Arama soncularinin Samsung icerdigini test eder")
    public void aramaSoncularininSamsungIcerdiginiTestEder() {
        String actualResultContent = amazonPage.searchResult.getText();
        String expectedContent = "Samsung";
        Assert.assertTrue(actualResultContent.contains(expectedContent));
    }

    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualResultContent = amazonPage.searchResult.getText();
        String expectedContent = "Java";
        Assert.assertTrue(actualResultContent.contains(expectedContent));
    }

    @Then("Title'in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    //PARAMETRELI KULLANIM

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String givenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(givenUrl));
    }

    @When("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakKelime) {
        amazonPage.searchBox.sendKeys(aranacakKelime+Keys.ENTER);
    }

    @Then("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String expectedIcerik) {
        String actualIcerik = amazonPage.searchResult.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("{int} saniye bekler")
    public void saniyeBekler(int waitSecond) {
        try {
            Thread.sleep(1000L * waitSecond);
        } catch (InterruptedException e) {

        }
    }

    @Then("Arama butonuna tiklar")
    public void aramaButonunaTiklar() {
        amazonPage.yotubeSearchBox.click();
    }

    @Then("{string} icin gerekli arama yapar")
    public void icinGerekliAramaYapar(String aranacakKelime) {
        amazonPage.yotubeSearchBox.sendKeys(aranacakKelime+Keys.ENTER);
    }


}
