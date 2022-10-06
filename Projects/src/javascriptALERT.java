import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class javascriptALERT {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


//         js alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert box = driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(2000);
        box.accept();


        // js confirm
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert box = driver.switchTo().alert();
//        String text = driver.switchTo().alert().getText();
//        System.out.println(text);
//        Thread.sleep(1000);
//        box.accept();
////        box.dismiss();


//         js prompt
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert box = driver.switchTo().alert();
//        String text = driver.switchTo().alert().getText();
//        System.out.println(text);
//        Thread.sleep(1000);
//        box.sendKeys("JAVASCRIPT ALERT");
//        Thread.sleep(2000);
//        box.accept();
    }
}
