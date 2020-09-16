import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/usr/local/lib/node_modules/chromedriver/lib/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        checkBox3.click();

//        driver.quit();
    }
}
