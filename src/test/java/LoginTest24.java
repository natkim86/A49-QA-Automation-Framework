import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest24 extends BaseTest{
LoginPage loginPage;

@BeforeMethod
void setup(){
    loginPage = new LoginPage(driver);
    driver.get(url);
}
    @Test
    public void invalidEmailPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.provideEmail("incorrectEmail").providePassword("incorrectPwd").clickSubmit();
    }
@Test
    public void emptyEmail() {
    loginPage.provideEmail("").providePassword("incorrectPwd").clickSubmit();
}
  @Test
  public void emptyEmailPassword() {
    loginPage.provideEmail("").providePassword("").clickSubmit();
  }
//@AfterClass
   // public void closeBrowser(){
   // driver.quit();
}
//}
