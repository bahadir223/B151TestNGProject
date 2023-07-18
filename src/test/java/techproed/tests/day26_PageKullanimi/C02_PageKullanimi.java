package techproed.tests.day26_PageKullanimi;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanimi {

    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));
        //Username : Admin
        //Password : admin123


        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim

        //Login Testinin basarili oldugunu test et

        //Sayfayı kapatınız


    }
}
