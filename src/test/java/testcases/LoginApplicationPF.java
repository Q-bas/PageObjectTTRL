package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import objectRepo.RedeffLoginpage;
import objectRepo.redeffLoginpagePF;
import objectRepo.rediffHomePage;

public class LoginApplicationPF {
    
    @Test
    public void Login() {
        System.setProperty("webdriver.chrome.driver","/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        redeffLoginpagePF rd=new redeffLoginpagePF(driver);
        rediffHomePage rh = new rediffHomePage(driver);

        rd.EmailId().sendKeys("hello");
        rd.Pwd().sendKeys("world");
        rd.SigninB().click();
        rd.returnHome().click();
        rh.searchField().sendKeys("Book");
        rh.searchButton().click();



    }
}
