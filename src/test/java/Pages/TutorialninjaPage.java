package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialninjaPage {
    public TutorialninjaPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonePdaTik;

    @FindBy(tagName = "//h4/a")
    public List<WebElement> tlfnMarkalari;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement>sepeteEklenecekler;

    @FindBy(xpath = "//*[@id='cart']")
    public WebElement sepetTik;

    @FindBy(xpath = "//*[@class='text-left']")
    public List<WebElement> sepettekiIsimler;


}
