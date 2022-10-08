import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengingDom {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

    driver.findElement(By.xpath("//a[contains(id='0c6cea60-2834-013b-f0fd-1a84755cd8af)]")).click();
    Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='0c6ce830-2834-013b-f0fc-1a84755cd8af']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='0c6cea60-2834-013b-f0fd-1a84755cd8af']")).click();
//        Thread.sleep(2000);


    }
}
