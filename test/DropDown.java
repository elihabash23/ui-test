import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/usr/local/lib/node_modules/chromedriver/lib/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement autoCompleteItem = driver.findElement(By.id("autocomplete"));
        autoCompleteItem.click();

//        driver.quit();
    }
}
