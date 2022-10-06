import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicContent {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");

        Thread.sleep(1500);
        driver.findElement(By.linkText("click here")).click();
        Thread.sleep(2000);
    }
}