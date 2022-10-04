import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");

        WebElement frame= driver.findElement( By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement element= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(element,300,100).perform();
    }
}
