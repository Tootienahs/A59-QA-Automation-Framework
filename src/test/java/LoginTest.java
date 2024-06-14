import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {



    @Test
    public void loginValidEmailPassword() throws InterruptedException {



       // navigateToPage();

        enterEmail(email);
        Thread.sleep(2000);
        enterPassword(password);
        Thread.sleep(2000);

        submit();
        Thread.sleep(2000);

        WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar"));
        Thread.sleep(2000);
        Assert.assertTrue(avatarIcon.isDisplayed());



    }


    @Test
    public void loginInvalidEmailValidPassword() throws InterruptedException {



       // navigateToPage();
        String expectedUrl="https://qa.koel.app/";

        enterEmail("invalid@testpro.io");
        enterPassword("jKV0uSX6z1dv");
        submit();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);



    }


    @Test
    public void loginEmailEmptyPassword() throws InterruptedException {



     //   navigateToPage();
        String expectedUrl="https://qa.koel.app/";
        enterEmail("christina.taylor@testpro.io");
        Thread.sleep(2000);
        submit();
        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);


    }

}


