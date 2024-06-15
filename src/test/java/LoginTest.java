import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {



@Test
    public void loginValidEmailPassword() throws InterruptedException {



        //navigateToPage();
    enter
     enterEmail("christina.taylor@testpro.io");
     enterPassword("jKV0uSX6z1dv");

        submit();
        WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar"));
        Thread.sleep(2000);
        Assert.assertTrue(avatarIcon.isDisplayed());




    }

@Test
    public void loginInvalidEmailValidPassword() throws InterruptedException {



       // navigateToPage();

        String expectedUrl ="https://qa.koel.app/";
    enterEmail("invalid@testpro.io");
    enterPassword("jKV0uSX6z1dv");



        Thread.sleep(2000);

        submit();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);



    }

public void loginValidEmailEmptyPassword() throws InterruptedException {


        //  navigateToPage();
        String expectedUrl = "https://qa.koel.app/";
        enterEmail("christina.taylor@testpro.io");
        enterPassword("");
        Thread.sleep(2000);
        submit();


        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);


    }


@Test(dataProvider = "negativeLoginTestData")
    public void loginNegativeTest(String email, String password) throws InterruptedException {
        String expectedUrl ="https://qa.koel.app/";
            enterEmail(email);
            enterPassword(password);
            submit();
            Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }
}


