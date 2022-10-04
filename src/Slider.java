import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");

        WebElement frame= driver.findElement( By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement SLIDER= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.dragAndDropBy(SLIDER,100,125).perform();

        Thread.sleep(2000);
        action.dragAndDropBy(SLIDER,-80,125).perform();
    }
}
