import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement element1= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/img[1]"));
        Actions action= new Actions(driver);
        action.moveToElement(element1).perform();
        Thread.sleep(1500);

        WebElement element2= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[2]/img[1]"));
        action.moveToElement(element2).perform();
        Thread.sleep(1500);

        WebElement element3= driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/img[1]"));
        action.moveToElement(element3).perform();

    }
}
