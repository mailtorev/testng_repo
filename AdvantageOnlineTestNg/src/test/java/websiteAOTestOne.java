import org.example.AOHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class websiteAOTestOne {

    WebDriver driver;
    String chromeDriverPath = "C:\\Users\\rthang384\\OneDrive - Comcast\\automation\\chromedriver_win32\\chromedriver.exe";
    AOHomePage homePage;

    @BeforeTest
    public void baseSetup(){
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://advantageonlineshopping.com/");
    }


}
