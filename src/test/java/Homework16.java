import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 {

    @Test

    public void registrationNavigation() throws InterruptedException {


        //pre-conditions

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Step 1

        String url = "https://qa.koel.app/";
        driver.get(url);
        Thread.sleep(2000);

        // Step 2

        WebElement registrationBtn = driver.findElement(By.cssSelector("a[href='registration']"));
        registrationBtn.click();
        Thread.sleep(2000);

        // Step 3 Assert
        WebElement registrationField = driver.findElement(By.cssSelector("[method='post']"));
        Assert.assertTrue(registrationField.isDisplayed());

        // Step 4

        driver.quit();







    }

}
