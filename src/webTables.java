import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class webTables {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.asx.com.au//");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("banner-actions-container")));

            Thread.sleep(1500);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement element= driver.findElement(By.xpath("//a[contains(text(),'Markets')]"));

        Actions action= new Actions(driver);
        action.moveToElement(element).perform();
        Thread.sleep(1500);

        driver.findElement(By.linkText("Cash market prices")).click();

        driver.findElement(By.className("col-xs-12 col-sm-6 col-md-4"));

    }
}
