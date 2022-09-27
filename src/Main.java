import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement mail=driver.findElement(By.id("email"));
        mail.sendKeys("muskanmanhas@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("test");

        driver.findElement(By.name("login")).click();

    }
}