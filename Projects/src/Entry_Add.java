import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Entry_Add {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/entry_ad");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[contains(text(),'Close')]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='restart-ad']")).click();
    }
}