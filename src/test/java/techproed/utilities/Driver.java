package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
        /*
       Driver class'indan obje olusturmanin onune gecebilmek icin
       default constructor'i private yaparak bunu engellemis oluruz. Bu kaliba da Singleton patter denir
        */
    }

    /*
    POM (Page Object Model)
           Test senaryolarının daha az kod ile yazılmasına ve bakımının daha kolay yapılmasına olanak
           sağlayan yazılım test yöntemidir. TestNG ve Cucumber framework'lerinde POM kalıbı kullanılır.

     */

    static WebDriver driver;

    public static WebDriver getDriver() {
         /*
    Driver'i her çağırdığımızda yeni bir pencere açılmasının önüne geçmek için
    if bloğu içinde Eğer driver'a değer ATANMAMIŞSA değer ata, eğer değer atanmışsa
    driver'i aynı sayfada return et
        */
        if (driver == null) {   // --> driver'a değer atanmamışsa
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {//-->driver'a deger ATANMISSA
            driver.close();
            driver = null;//-->driver'i kapattiktan sonra bosalt
        }
    }
    public static void quitDriver() {
        if (driver != null) {//-->driver'a deger ATANMISSA
            driver.quit();
            driver = null;//-->driver'i kapattiktan sonra bosalt
        }
    }
}
