import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement frame= driver.findElement( By.id("content"));
        driver.switchTo();
        WebElement A= driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement B = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions action = new Actions(driver);
        action.dragAndDrop(A, B);
        Thread.sleep(2000);
        action.perform();
    }
}
