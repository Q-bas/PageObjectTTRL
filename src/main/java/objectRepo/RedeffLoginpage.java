package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedeffLoginpage {

    WebDriver driver;
    public RedeffLoginpage(WebDriver driver){
        this.driver=driver;
    }
    By username = By.id("login1");
    By password = By.id("password");
    By signinBtn = By.name("proceed");
    By backHome = By.className("f12");

    public WebElement EmailId(){
        return driver.findElement(username);
    }
    public WebElement Pwd(){
        return driver.findElement(password);
    }
    public WebElement SigninB(){
        return driver.findElement(signinBtn);
    }
    public WebElement returnHome(){
        return driver.findElement(backHome);
    }
}

