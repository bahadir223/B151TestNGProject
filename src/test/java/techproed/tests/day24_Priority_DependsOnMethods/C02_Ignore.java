package techproed.tests.day24_Priority_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Ignore {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void amazonTest() {
        driver.get("https://amazon.com");   // --> 2. olarak amazon calissin.
    }

    @Test
    public void youtTubeTest() {
        driver.get("https://youtube.com");  // --> ilk önce youtube calissin.
    }

    @Test(priority = 2)
    public void facebookTest() {
        driver.get("https://facebook.com"); // --> Son olarak facebook calissin.
    }

    @AfterMethod
    public void tearDown() {

    }
}
