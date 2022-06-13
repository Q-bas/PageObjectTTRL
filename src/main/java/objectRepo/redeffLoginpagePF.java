package objectRepo;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redeffLoginpagePF {

    WebDriver driver;
    public redeffLoginpagePF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="login1")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(name="proceed")
    WebElement signinBtn;

    @FindBy(className="f12")
    WebElement backHome;


    // By username = By.id("login1");
    // By password = By.id("password");
    // By signinBtn = By.name("proceed");
    // By backHome = By.className("f12");

    public WebElement EmailId(){
        return username;
    }
    public WebElement Pwd(){
        return password;
    }
    public WebElement SigninB(){
        return signinBtn;
    }
    public WebElement returnHome(){
        return backHome;
    }
}

