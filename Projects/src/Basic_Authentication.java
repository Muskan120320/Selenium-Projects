
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Basic_Authentication {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String username = "admin";

        String password = "admin";

        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000));
        String title = driver.getTitle();

        System.out.println("The page title is "+title);
        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println("The test present in page is ==> "+text);

    }

}