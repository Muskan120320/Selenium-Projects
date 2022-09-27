import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radio {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create")).click();

        List<WebElement> gender=driver.findElements(By.name("sex"));
       int count =gender.size();
        System.out.println(count);

        for(int i=0;i<count; i++){

        String text=  gender.get(i).getText();
            System.out.println(text);
            gender.get(i).click();
            Thread.sleep(1000);


        }
    }
}
