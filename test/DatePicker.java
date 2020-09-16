import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/usr/local/lib/node_modules/chromedriver/lib/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("12/11/2010");
        dateField.sendKeys(Keys.RETURN);

        // Look up how to select a date by clicking

//        driver.quit();
    }
}
