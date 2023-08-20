import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;

public class Homework17 extends BaseTest {


    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongNotification = "Added 1 song into";


        navigateToPage();
        provideEmail("natalia.kim01@testpro.io");
        providePassword("AxKrdBnS");
        clickSubmit();
        searchSong("Lament");
        clickViewAllBtn();
        clickFirstSong();
        clickAddTo();
        choosePlaylist();
        Assert.assertTrue(getNotificationText().contains(newSongNotification));


    }
    public void searchSong(String name) throws InterruptedException {
        WebElement searchField = driver.findElement(By.cssSelector("div#searchForm input[type= 'search']"));
        searchField.sendKeys(name);
        Thread.sleep(2000);

    }

    public void clickViewAllBtn() throws InterruptedException {
        WebElement viewAll = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
        viewAll.click();
        Thread.sleep(2000);

    }
    public void clickFirstSong() throws InterruptedException {
        WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
        firstSong.click();
        Thread.sleep(2000);

    }


    public void clickAddTo() throws InterruptedException {
        WebElement addTo = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//button[@data-test='add-to-btn']"));
        addTo.click();
        Thread.sleep(2000);
    }


    public void choosePlaylist() throws InterruptedException {
        WebElement playList = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Homework')]"));
        playList.click();
        Thread.sleep(2000);
    }


    public String getNotificationText() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        System.out.println(notification.getText());
        return notification.getText();

    }
}