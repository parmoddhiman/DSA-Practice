import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.get("https://www.facebook.com");
    }
}
