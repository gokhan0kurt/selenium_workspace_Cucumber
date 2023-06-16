package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyStepDefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("Ilk login butonuna tiklar")
    public void ilk_login_butonuna_tiklar() {
        qualitydemyPage.upLoginButton.click();
    }


    @Then("Gecerli email adresini email kutusuna girer")
    public void adresiniEmailKutusunaGirer() {
        qualitydemyPage.emailBox.sendKeys(ConfigReader.getProperty("qdValidUsername"));
    }

    @Then("Gecerli sifre'yi password kutusuna girer")
    public void gecerliSifreYiPasswordKutusunaGirer() {
        qualitydemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdValidPass"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        qualitydemyPage.downLoginButton.click();
    }

    @Then("Basarili giris yaptigini dogrular")
    public void basariliGirisYaptiginiDogrular() {
        Assert.assertTrue(qualitydemyPage.successLogin.isDisplayed());
    }

    @Then("Gecersiz sifreyi password kutusuna girer")
    public void gecersizSifreyiPasswordKutusunaGirer() {
        qualitydemyPage.passwordBox.sendKeys(ConfigReader.getProperty("qdInvalidPass"));
    }

    @Then("Login butonunun hala gorunur oldugunu dogrular")
    public void loginButonununHalaGorunurOldugunuDogrular() {
        Assert.assertTrue(qualitydemyPage.downLoginButton.isDisplayed());
    }

    @When("Gecersiz email adresini email kutusuna girer")
    public void gecersizEmailAdresiniEmailKutusunaGirer() {
        qualitydemyPage.emailBox.sendKeys(ConfigReader.getProperty("qdInvalidEmail"));
    }

    @And("Url'in {string} oldugunu test eder")
    public void urlInOldugunuTestEder(String verilenUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, ConfigReader.getProperty(verilenUrl));
    }

    @Then("user email olarak {string} girer")
    public void userEmailOlarakGirer(String verilenEmail) {
        qualitydemyPage.emailBox.sendKeys(verilenEmail);
    }

    @Then("password olarak {string} girer")
    public void passwordOlarakGirer(String verilenPass) {
        qualitydemyPage.passwordBox.sendKeys(verilenPass);
    }
}
