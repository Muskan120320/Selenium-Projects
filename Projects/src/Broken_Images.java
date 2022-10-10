import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Broken_Images {

    public static void main(String[] args) throws IOException, InterruptedException {
        verfiyImage();

    }
    public static void verfiyImage() throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\p\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/broken_images");

        Thread.sleep(2000);
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size  ());

        for( WebElement image : images) {
            String imageSrc = image.getAttribute("src");

            try {
                URL url = new URL(imageSrc);
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();

                if(httpURLConnection.getResponseCode() == 200)
                    System.out.println(imageSrc + ">>" + httpURLConnection.getResponseCode() + ">>" +httpURLConnection.getResponseMessage());
                else
                    System.err.println(imageSrc + ">>" + httpURLConnection.getResponseCode() + ">>" +httpURLConnection.getResponseMessage());

            } catch (IOException e) {
                System.err.println(imageSrc);
            }
        }

    }
}