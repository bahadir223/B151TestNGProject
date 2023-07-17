package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    POM (Page Object Model)
           Test senaryolarının daha az kod ile yazılmasına ve bakımının daha kolay yapılmasına olanak
           sağlayan yazılım test yöntemidir. TestNG ve Cucumber framework'lerinde POM kalıbı kullanılır.

     */

    static WebDriver driver;

    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
