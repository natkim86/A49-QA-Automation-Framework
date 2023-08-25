import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {


    @Test
    public void deletePlaylist() throws InterruptedException {
        String deletedMessage = "Deleted playlist \"homework19.\"";

        navigateToPage();
        provideEmail("natalia.kim01@testpro.io");
        providePassword("AxKrdBnS");
        clickSubmit();
        clickPlaylist();
        clickDeletePlayList();
        deletePlayListMessage();
        Assert.assertEquals(deletePlayListMessage(), deletedMessage);

    }

    private void clickPlaylist() {
        WebElement playList = driver.findElement(By.cssSelector(".playlist:nth-child(4)"));
        playList.click();

    }

    private void clickDeletePlayList() throws InterruptedException {
        WebElement deleteList = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deleteList.click();
        Thread.sleep(2000);

    }

    private String deletePlayListMessage() {
        WebElement deleteMsg = driver.findElement(By.cssSelector("div.success.show"));
        return deleteMsg.getText();

    }

}