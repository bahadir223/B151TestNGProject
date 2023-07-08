package techproed.tests.day24_Priority_DependsOnMethods_SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C06_SoftAssert {
    /*
    SoftAssert kullanımında JUnitteki daha önce kullandığımız methodların aynısını kullanırız.
    Daha önceden kullandığımız assertion nerde hata alırsa orda testlern calismasini durduruyordu.
    SoftAssert'te ne kadar assertion kullansak da nerde assertAll() methodu kullanırsak testlerimiz de
    kullandığımız assertionlar orda sonlanır ve hata varsa bunu bize konsolda belirtir.
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        driver.get("https://amazon.com");

        //Url in amazon.com.tr olup olmadigini dogrulayiniz.
        SoftAssert softAssert = new SoftAssert(); // --> SoftAssert kullanabilmek icin SoftAssert class'indan object olusturmaliyiz.
        softAssert.assertEquals(driver.getCurrentUrl(), "https://amazon.com.tr"); // --> normalde tr yok biz burada bilerek hata alacağız.

        //Basligin best icerdigini test edelim.
        softAssert.assertTrue(driver.getTitle().contains("best")); // bilerek hata alicaz.

        //arama kutusunda iphone aratalım.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //sonucun samsung icerip icermedigini test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        softAssert.assertTrue(sonucYazisi.getText().contains("samsung")); // --> bilerek hata alicaz

        softAssert.assertAll();
        System.out.println("Burası calismaz.");
    }

    @Test
    public void test02() {
        driver.get("https://amazon.com");

        //Url in amazon.com.tr olup olmadigini dogrulayiniz.
        SoftAssert softAssert = new SoftAssert(); // --> SoftAssert kullanabilmek icin SoftAssert class'indan object olusturmaliyiz.
        softAssert.assertEquals(driver.getCurrentUrl(), "https://amazon.com.tr"); // --> normalde tr yok biz burada bilerek hata alacağız.

        //Basligin best icerdigini test edelim.
        softAssert.assertTrue(driver.getTitle().contains("best")); // bilerek hata alicaz.

        //arama kutusunda iphone aratalım.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //sonucun samsung icerip icermedigini test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        softAssert.assertTrue(sonucYazisi.getText().contains("samsung")); // --> bilerek hata alicaz


        System.out.println("Burası calismaz.");
        softAssert.assertAll();
    }
}
