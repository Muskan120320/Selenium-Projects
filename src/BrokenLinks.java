import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");

        List<WebElement> links= driver.findElements(By.tagName("a"));
        links.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Total number of links and images are: "+links.size());

        List<WebElement> activelinks= new ArrayList<WebElement>();
        for(int i=0; i<links.size(); i++){

            if (links.get(i).getAttribute("href")!=null){
                activelinks.add(links.get(i));
            }
        }
        System.out.println("Total Active links are : "+ activelinks.size());
        System.out.println("Total Inctive links are : "+(links.size()-activelinks.size()));

        for(int j=0; j<activelinks.size(); j++){
            HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
            connection.connect();
            String response= connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activelinks.get(j).getAttribute("href")+"---->"+response);
        }
    }
}
