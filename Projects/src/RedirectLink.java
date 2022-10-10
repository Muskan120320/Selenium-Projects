import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectLink {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/redirector");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@id='redirect']")).click();

        driver.navigate().to("https://the-internet.herokuapp.com/status_codes/500");
        Thread.sleep(2000);
        driver.navigate().back();

        driver.navigate().to("https://the-internet.herokuapp.com/status_codes/301");

    }
}
