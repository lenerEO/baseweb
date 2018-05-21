package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidResultPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy (id = "firstHeading")
    private WebElement lblTitle;

    @FindBy (id = "footer-info-lastmod")
    private WebElement lblLastEdited;

    int seconds = 30;

    public ValidResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(lblTitle));
        return lblTitle.getText();
    }

    public String getLastEdited(){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(lblLastEdited));
        return lblLastEdited.getText();
    }
}
