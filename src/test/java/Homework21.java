import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {

    String playListName;

    @Test
    public void renamePlayList() {
        String updateMessage = "Updated playlist \"homework19.\"";
        playListName = "homework19";

        navigateToPage();
        provideEmail("natalia.kim01@testpro.io");
        providePassword("AxKrdBnS");
        clickSubmit();
        doubleClickPlaylist();
        playListName ="Updated"+playListName;
       enterNewPlayListName(playListName);
      Assert.assertEquals(playListMessage(), updateMessage);
    }
    public void doubleClickPlaylist() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'" + playListName + "')]")));
        actions.doubleClick(playlistElement).perform();
    }
   public void enterNewPlayListName(String newPlayListName) {WebElement playListInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        playListInputField.sendKeys(Keys.chord(Keys.COMMAND, "A", Keys.BACK_SPACE));
       playListInputField.sendKeys(newPlayListName);
       playListInputField.sendKeys(Keys.ENTER);
   }
    public String playListMessage() {
      WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
      return notification.getText();
    }
}