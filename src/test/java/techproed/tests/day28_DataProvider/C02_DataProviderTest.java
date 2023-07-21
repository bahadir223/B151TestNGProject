package techproed.tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_DataProviderTest {
    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{{"BMW"}, {"Audi"}, {"Mercedes"}, {"Volvo"}};
    }

    /*
    Google sayfasina gidip
    DataProvider ile belirtilen araç isimlerini aratalım.
     */

    @Test(dataProvider = "arabalar")
    public void test01(String araclar) {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        GooglePage googlePage=new GooglePage();
        googlePage.aramaKutusu.sendKeys(araclar);

    }
}
