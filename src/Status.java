import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Status {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement img= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
        System.out.println(img.isDisplayed());
        System.out.println(img.isEnabled());
        System.out.println(img.isSelected());

        WebElement mail=driver.findElement(By.id("email"));
        mail.sendKeys("muskanmanhas@gmail.com");
        Thread.sleep(1000);
        mail.clear();
        mail.sendKeys("manhasmuskan@gmail.com");
    }
}
