package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.RedeffLoginpage;
import objectRepo.rediffHomePage;

public class LoginApplication {
    
    @Test
    public void Login() {
        System.setProperty("webdriver.chrome.driver","/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RedeffLoginpage rd=new RedeffLoginpage(driver);
        rediffHomePage rh = new rediffHomePage(driver);

        rd.EmailId().sendKeys("hello");
        rd.Pwd().sendKeys("world");
        rd.SigninB().click();
        rd.returnHome().click();
        rh.searchField().sendKeys("Book");
        rh.searchButton().click();



    }
}
