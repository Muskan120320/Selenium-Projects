import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Exit_Intent {
    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://the-internet.herokuapp.com/exit_intent");

                Robot rb = new Robot();
                rb.mouseMove(600, 0);
            }
        }
