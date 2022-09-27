import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
//
//        driver.findElement(By.linkText("Create a Page")).click();
//        driver.findElement(By.partialLinkText("Create")).click();
//        driver.close();
//        driver.quit();

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Welcome");

    }
}
