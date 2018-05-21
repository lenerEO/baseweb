package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy (id = "firstHeading")
    private WebElement lblTitle;

    @FindBy (css = ".mw-search-nonefound")
    private WebElement lblNotFound;

    int seconds = 30;

    public NoResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(lblTitle));
        return lblTitle.getText();
    }

    public String getNotFound(){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(lblNotFound));
        return lblNotFound.getText();
    }
}
