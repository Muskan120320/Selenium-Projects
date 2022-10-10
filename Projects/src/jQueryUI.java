import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jQueryUI {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");

        WebElement element1= driver.findElement(By.xpath("//a[contains(text(),'Enabled')]"));
        Actions action= new Actions(driver);
        action.moveToElement(element1).perform();
        Thread.sleep(1000);

        WebElement element2= driver.findElement(By.xpath("//a[contains(text(),'Downloads')]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(element2).perform();

         driver.findElement(By.xpath("//a[contains(text(),'PDF')]")).click();

    }
}
