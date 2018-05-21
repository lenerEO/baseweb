package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy (id = "searchInput")
    private WebElement inpSearch;

    @FindBy (id = "searchButton")
    private   WebElement btnSearch;

    int seconds = 30;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputText(String term){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(inpSearch));
        Actions action = new Actions(driver);
        action.sendKeys(inpSearch, term).build().perform();
    }

    public void clickSearch(){
        wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(btnSearch));
        btnSearch.click();
    }
}
