package keywordDriven;
import java.util.concurrent.TimeUnit;
import utility.Constants;
public class Action_keyword
{
    public static WebDriver driver;
    public void openBrowser()
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\olna0715\\Documents\\My Folder\\Univer\\TA\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void navigate()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.URL);
    }
    public void enterEmail()
    {
        Object By;
        driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(Constants.username);
    }
    public void enterPassword()
    {
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(Constants.password);
    }
    public void clickSignIn()
    {
        driver.findElement(By.xpath("//form[@id='signin_signup_form']//input[@id='user_submit']")).click();
    }

    public void logout()
    {
        driver.findElement(By.xpath("//a[@id='sign_out_link']")).click();
    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
