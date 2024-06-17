import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist() throws InterruptedException {

        String deletedNotification = "Deleted playlist lazy days}";

        enterEmail("christina.taylor@testpro.io");
        enterPassword("jKV0uSX6z1dv");
        submit();
        //Click the playlist
        clickLazyDays();
        // Delete Playlist
        removePlayList();
        //deletedMessage

    }

    public String deletedPlaylist() {
            WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
            return notification.getText();


    }

        public void removePlayList() {
            WebElement removePlaylist = driver.findElement
                    (By.cssSelector("button[class='del btn-delete-playlist']"));
            removePlaylist.click();
        }


        public void clickLazyDays () {

            WebElement lazyDays = driver.findElement(By.cssSelector("[class='playlist playlist']"));
            lazyDays.click();
        }
    }




