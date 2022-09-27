import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Digest_Authentication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//
//        String username = "admin";
//        String password = "admin";


//        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get("https://the-internet.herokuapp.com/digest_auth");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        String title = driver.getTitle();

        System.out.println("The page title is "+title);

        String text = driver.findElement(By.tagName("p")).getText();

        System.out.println("The test present in page is ==> "+text);

//        driver.close();
//        driver.quit();

    }

}
