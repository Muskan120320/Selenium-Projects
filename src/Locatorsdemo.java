import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement mail=driver.findElement(By.id("email"));
        mail.sendKeys("muskanmanhas@gmail.com");
        Thread.sleep(1000);
        mail.clear();
        mail.sendKeys("manhasmuskan@gmail.com");

        WebElement password= driver.findElement(By.name("pass"));
        password.sendKeys("test");

//        driver.findElement(By.className("inputText"));
//        driver.findElement(By.tagName("input"));
//        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Forgotten")).click();
    }
}
