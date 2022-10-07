import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslError {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
       //GLOBAL PROFILE
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);

        ChromeOptions coptions= new ChromeOptions();
        coptions.merge(dc);

        WebDriver driver = new ChromeDriver(coptions);
//        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
    }
}
