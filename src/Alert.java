import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kartc.in/oprs-web/");
        driver.findElement(By.xpath("//button[@type'submit']")).click();
        Thread.sleep(2000);

        String text= driver.switchTo().alert().getText();
        System.out.println(text);

    }
}
