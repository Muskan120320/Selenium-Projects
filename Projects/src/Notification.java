import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");

//TODO // updated.

        driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
        driver.findElement(By.id("flash")).isDisplayed();
    }
}
