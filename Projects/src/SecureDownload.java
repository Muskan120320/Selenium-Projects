import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecureDownload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String username = "admin";
        String password = "admin";

        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/download_secure";
        driver.get(URL);
    }
}
