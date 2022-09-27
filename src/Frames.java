import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();

        WebElement frame1= driver.findElement(By.id("frameElement"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/button")).click();
//        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

    }
}
