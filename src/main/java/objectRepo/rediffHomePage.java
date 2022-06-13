package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffHomePage {

    WebDriver driver;
    public rediffHomePage(WebDriver driver){
        this.driver=driver;
    }
    //items' locators list
    By srchFld = By.id("srchword");
    By srchBtn = By.xpath("//input[@aria-label='Search']");
    //find elements on a page methods
    public WebElement searchField(){
        return driver.findElement(srchFld);
    }
    public WebElement searchButton(){
        return driver.findElement(srchBtn);
    }
}