package techproed.tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProviderTest {

    /*
    Dataprovider, birçok veriyi test caselerde loop kullanmadan aktarmak icin kullanilir.
    TestNG'den gelen bir özelliktir.
    2 boyutlu Object Array return eder.
    Kullanımı icin @Test notasyonundan sonra parametre olarak (dataprovider="method ismi") yazilir.
    Kaç tane veri ile calisacaksak test methoduna o kadar parametre eklenir.
     */

    @DataProvider
    public static Object[][] isimler() {
        return new Object[][]{{"esen"}, {"mehmet"}, {"esma"}, {"ali"}, {"mert"}, {"burcu"}, {"yunus"}};
    }

    @Test(dataProvider = "isimler")
    public void test01(String data) {
        System.out.println(data);
    }
}
