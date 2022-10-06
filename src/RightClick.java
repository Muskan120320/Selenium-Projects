import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/#colorpicker");

        WebElement frame= driver.findElement( By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
      WebElement colour= driver.findElement(By.id("blue"));
        Actions action = new Actions(driver);
      action.contextClick(colour).perform();

    }
}
