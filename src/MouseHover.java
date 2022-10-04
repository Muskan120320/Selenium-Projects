import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        //TODO CHANGE XPATH// changed
       WebElement element= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]"));

       Actions action= new Actions(driver);
       action.moveToElement(element).perform();
       Thread.sleep(1500);

        WebElement element1= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
        action.moveToElement(element1).perform();
    }
}
