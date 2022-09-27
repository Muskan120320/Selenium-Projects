import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");

        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/8561134031\"]/span/a/span")).click();
        Thread.sleep(2000);
    }
}
