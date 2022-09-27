import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Facebook_Create_Account {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.partialLinkText("Create")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("_n3")));

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Muskan");

        WebElement Surname=driver.findElement(By.name("lastname"));
        Surname.sendKeys("Manhas");


        WebElement mail=driver.findElement(By.name("reg_email__"));
        mail.sendKeys("manhasmuskan@gmail.com");

        WebElement Confirm_mail=driver.findElement(By.name("reg_email_confirmation__"));
        Confirm_mail.sendKeys("manhasmuskan@gmail.com");

        WebElement Password=driver.findElement(By.id("password_step_input"));
        Password.sendKeys("test");


        WebElement day= driver.findElement(By.id("day"));
        Select d1=new Select(day);
        d1.selectByValue("12");

        WebElement Month= driver.findElement(By.id("month"));
        Select Mon=new Select(Month);
        Mon.selectByVisibleText("Mar");

        WebElement Year= driver.findElement(By.id("year"));
        Select New=new Select(Year);
        New.selectByVisibleText("2000");

        driver.findElements(By.xpath("//label[text()='Female'"));
        driver.findElement(By.name("websubmit")).click();

        }

    }

