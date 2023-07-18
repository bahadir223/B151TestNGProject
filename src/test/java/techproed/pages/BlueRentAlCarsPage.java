package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentAlCarsPage {

    public BlueRentAlCarsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement eMail;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement girisYapildiJack;



}
