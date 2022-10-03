import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\supremacy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        driver.findElement(By.xpath("//span[contains(text(),'Try For Free')]")).click();
        Thread.sleep(1500);
       Set<String> windowHandles= driver.getWindowHandles();
        System.out.println(windowHandles);

        Iterator<String> iterator= windowHandles.iterator();
        String parentwindow = iterator.next();
        System.out.println(parentwindow);
        String childwindow = iterator.next();
        System.out.println(childwindow);

        driver.switchTo().window(childwindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("Muskan");
        driver.findElement(By.name("UserLastName")).sendKeys("Manhas");
        Thread.sleep(1000);
        driver.switchTo().window(parentwindow);

    }
}
