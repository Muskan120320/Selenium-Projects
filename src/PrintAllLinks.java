import graphql.util.EscapeUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        List<WebElement> alltags= driver.findElements(By.tagName("a"));
        System.out.println(("Total tags are: "+ alltags.size()));

        for(int i=0;i<alltags.size();i++){
            System.out.println("Links on page are "+alltags.get(i).getAttribute("href"));
            System.out.println("Links on page are "+alltags.get(i).getText());
        }
    }
}
