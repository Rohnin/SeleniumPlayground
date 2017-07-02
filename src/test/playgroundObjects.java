package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class playgroundObjects {

    private WebDriver driver;
    protected static String baseUrl = "http://timvroom.com/selenium/playground";

    public playgroundObjects(WebDriver driver) {
        this.driver = driver;
    };

    public void navigation() {
        driver.navigate().to(baseUrl);
    };

    public String pageTitle() {
        String title = driver.getTitle();
        return title;
    }

    @FindBy(xpath = "//*[@id=\"answer1\"]")
    WebElement boxOne;

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement nameBox;

    @FindBy(xpath = "//*[@id=\"occupation\"]")
    WebElement selectOccupation;

    @FindAll( {
            @FindBy(className = "bluebox")
    })
    public List<WebElement> resultBoxes;

    @FindBy(xpath = "//*[@id=\"answer4\"]")
    WebElement boxFour;

    @FindBy(xpath = "/html/body/a[3]")
    WebElement clickmeButton;

    @FindBy(xpath = "//*[@id=\"redbox\"]")
    WebElement redBox;

    @FindBy(xpath = "//*[@id=\"answer6\"]")
    WebElement boxSix;

    @FindBy(xpath = "//*[@id=\"answer8\"]")
    WebElement boxEight;

    @FindBy(xpath = "//*[@id=\"testform\"]/input[2]")
    WebElement bookSelectTrue;

    @FindBy(xpath = "//*[@id=\"answer10\"]")
    WebElement boxTen;

    @FindBy(xpath = "//*[@id=\"orangebox\"]")
    WebElement orangeBox;

    @FindBy(xpath = "//*[@id=\"greenbox\"]")
    WebElement greenBox;

    @FindBy(xpath = "//*[@id=\"answer11\"]")
    WebElement boxEleven;

    @FindBy(xpath = "//*[@id=\"answer13\"]")
    WebElement boxThirteen;

    @FindBy(xpath = "//*[@id=\"answer14\"]")
    WebElement boxFourteen;

    @FindAll(
            @FindBy(id = "ishere" ))
    List<WebElement> ishereObjects;

    @FindBy(id = "purplebox")
    WebElement purpleBox;

    @FindBy(linkText = "click then wait")
    WebElement clickThenWait;

    @FindBy(linkText = "click after wait")
    WebElement clickAfterWait;

    @FindBy(xpath = "//*[@id=\"submitbutton\"]")
    WebElement submitButton;
}