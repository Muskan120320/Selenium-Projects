import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContextMenu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/context_menu");


        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("hot-spot"));
        actions.contextClick(elementLocator).perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(2000);
        alert.accept();

    }
}
