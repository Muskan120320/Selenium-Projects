import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.plaf.TableHeaderUI;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.linkText("iFrame")).click();

        driver.findElement(By.xpath("//span[contains(text(),'File')]")).click();
        Thread.sleep(1500);

//        Actions action= new Actions(driver);
//        action.moveToElement(element).click();
        driver.findElement(By.xpath("//span[contains(text(),'Format')]")).click();

    }

}
