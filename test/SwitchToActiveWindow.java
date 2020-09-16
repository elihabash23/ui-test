import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/usr/local/lib/node_modules/chromedriver/lib/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        Thread.sleep(1000);

        String originalHandle = driver.getWindowHandle();   // Returns original handle

        for (String handle: driver.getWindowHandles()) {
            driver.switchTo().window(handle);   // Will switch to the second handle
        }
        Thread.sleep(1000);
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
