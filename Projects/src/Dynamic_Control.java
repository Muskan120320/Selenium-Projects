import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dynamic_Control{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.cssSelector("div#checkbox input"));
        checkbox.click();

        if(checkbox.isSelected()){
            driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[contains(text(),'Add')]"))));
        }
//        else {
//            Thread.sleep(3000);
//            checkbox.click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
//            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[contains(text(),'Add')]"))));
//        }

//        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
//            wait.until(ExpectedConditions.visibilityOfElementLocated
//                    ((By.xpath("//button[contains(text(),'Disable')]"))));
//            driver.findElement
//                    (By.xpath("//body/div[2]/div[1]/div[1]/form[2]/input[1]")).sendKeys("Hello");
//            Thread.sleep(2000);
    }
}