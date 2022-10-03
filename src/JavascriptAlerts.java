import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");


        WebElement frame1= driver.findElement(By.id("frameElement"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("/html/body/button")).click();
        Alert alertonpage = driver.switchTo().alert();
        alertonpage.sendKeys("RCV Accademy");
     alertonpage.accept();

//        String alertText= driver.switchTo().alert().getText();
//        System.out.println(alertText);
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

    }
}