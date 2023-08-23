import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.testng.Assert;
        import org.testng.annotations.Test;


public class Homework18 extends BaseTest{



    @Test
 public void playSong(){
    navigateToPage();
    provideEmail("natalia.kim01@testpro.io");
    providePassword("AxKrdBnS");
    clickSubmit();
    clickPlay();
    }

   private void clickPlay() {
       WebElement playNextSong = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
     WebElement playButton = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));

      playNextSong.click();
      playButton.click();

    }

    public boolean validateSong() {
        WebElement soundBar = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));
        return soundBar.isDisplayed();
    }

}





