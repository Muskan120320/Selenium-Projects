import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsEvent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://extendsclass.com/text-compare.html");

      WebElement sourceTextArea =driver.findElement(By.xpath("//span[contains(text(),\"Your documents remain confidnetial and private\")]"));
     Actions action= new Actions(driver);
        Thread.sleep(2000);
     action.keyDown(sourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

        WebElement sourcePasteArea =driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
        Thread.sleep(2000);
        action.keyDown(sourcePasteArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
    }
}
