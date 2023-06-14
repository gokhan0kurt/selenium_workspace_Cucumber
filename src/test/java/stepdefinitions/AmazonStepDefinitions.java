package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


    }

    @Then("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);
    }


    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

        String actualResultContent = amazonPage.searchResult.getText();
        String expectedResult = "Nutella";
        Assert.assertTrue(actualResultContent.contains(expectedResult));
    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();

    }


    @Then("Java icin arama yapar")
    public void javaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Java"+Keys.ENTER);

    }

    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualResult = amazonPage.searchResult.getText();
        String expectedResult = "Java";

        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
