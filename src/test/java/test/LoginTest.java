package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends TextBase
{
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void before()
    {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }


    @Test
    public void verifyValidLogin()
    {
        loginPage.setEmail("harsharnsoffice2@gmail.com");
        loginPage.setPassword("eve20000");
        loginPage.clickOnSignInButton();

        assertEquals(homePage.getLoggedInUsername(),"Harsharn Wijewardana");
    }
}




