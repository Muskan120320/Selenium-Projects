import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");

        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("Back is Executed");

        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("Forward Done..");

        driver.navigate().refresh();
        System.out.println("Refresh Done..");

    }
}
