import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

                driver.findElement(By.partialLinkText("Create")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("_n3")));

        WebElement day= driver.findElement(By.id("day"));

        Select d1=new Select(day);
//        d1.selectByIndex(4);
        d1.selectByValue("12");
        System.out.println(day.getAttribute("value"));


        List<WebElement> dd=d1.getOptions();
        System.out.println(dd.size());
        for(int i=0;i<dd.size(); i++){

            String text= dd.get(i).getText();
            System.out.println(text);
            dd.get(i).click();
        }


    }
}
