package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class playgroundTasks extends driver {

    @Test(description = "all tasks from Selenium Playground")
    public void fullRun() {
        playgroundObjects playground = PageFactory.initElements(driver, playgroundObjects.class);
        playground.navigation();
        //1
        playground.boxOne.sendKeys(playground.pageTitle());
        //2
        playground.nameBox.sendKeys("Kilgore Trout");
        //3
        Select dropdown = new Select(playground.selectOccupation);
        dropdown.selectByValue("scifiauthor");
        //4
        int blueboxes = playground.resultBoxes.size();
        playground.boxFour.sendKeys(String.valueOf(blueboxes));
        //5
        playground.clickmeButton.click();
        //6
        String redClass = playground.redBox.getAttribute("class");
        playground.boxSix.sendKeys(redClass);
        //7
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("ran_this_js_function();");
        //8
        Object valueOfJs = js.executeScript("return got_return_from_js_function();");
        playground.boxEight.sendKeys(String.valueOf(valueOfJs));
        //9
        playground.bookSelectTrue.click();
        //10
        String redValue = playground.redBox.getText();
        playground.boxTen.sendKeys(redValue);
        //11
        String boxesTrue = playground.orangeBox.getLocation().getY() > playground.greenBox.getLocation().getY() ? "green" : "orange";
        playground.boxEleven.sendKeys(boxesTrue);
        //12
        driver.manage().window().setSize(new Dimension(850, 650));
        //13
        if (playground.ishereObjects.size() == 0) {
            playground.boxThirteen.sendKeys("no");
        } else {
            playground.boxThirteen.sendKeys("yes");
        }
        //14
        String purpleTrue = playground.purpleBox.isDisplayed() ? "yes" : "no";
        playground.boxFourteen.sendKeys(purpleTrue);
        //15
        playground.clickThenWait.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(playground.clickAfterWait));
        playground.clickAfterWait.click();
        //16
        driver.switchTo().alert().accept();
        //17
        playground.submitButton.click();
    }
}
