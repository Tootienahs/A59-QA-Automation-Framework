import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    WebDriver driver = null;
    ChromeOptions options = new ChromeOptions();

    // String url = "https://qa.koel.app/";
    @DataProvider(name="negativeLoginTestData")

    public Object[][] getDataFromDataProviders() {
        return new Object[][]{
                {"invalid@testpro.io","invalidPassword"},
                {"christina.taylor@testpro.io,"invalidPassword"},
                {"invalid@testpro.io","jKV0uSX6z1dv"),
                {"christina.taylor@testpro.io, ""},
                {"", "jKV0uSX6z1dv);"}
    };
}

@BeforeSuite
    static void setup() {
WebDriverManager.chromedriver().setup();

}
        @BeforeMethod
        @Parameters({"BaseURL"})
        public void launchBrowser(String baseURL){

            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            navigateToPage(baseURL);

        }
 @AfterMethod

    public void closeBrowser(){
    driver.quit();
 }

    protected void submit() throws InterruptedException {
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
        Thread.sleep(2000);
    }

    protected void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys("jKV0uSX6z1dv");
    }

    protected void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);
    }

    protected void navigateToPage(String url) {
        driver.get(url);
    }
}


