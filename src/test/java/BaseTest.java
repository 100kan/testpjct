import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver = new ChromeDriver();

    @Before
    public void beforeMethod() {
    }

    @After
    public void afterMethod() {
        driver.quit();
    }
}