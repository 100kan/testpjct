import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_tests {
    WebDriver driver = new ChromeDriver();


    @Before
    public void before() {
        driver.get("http://www.wiley.com/WileyCDA/");
    }

    @After
    public void after() {
        driver.quit();
    }

    private void checkElementInTopMenuIsDisplayed(By cssSelector ){
        Assert.assertTrue(getTheTopMenu(By.id("links-site")).findElement(cssSelector).isDisplayed());
    }

    @Test
    public void test1() {
        System.out.println("Test 1 started");
checkElementInTopMenuIsDisplayed(By.ByCssSelector("sds"));
//    Assert.assertNotNull(driver.findElement(By.id("links-site")).findElements(By.linkText("Home")));
//    Assert.assertNotNull(driver.findElement(By.id("links-site")).findElements(By.linkText("Subjects")));
//    Assert.assertNotNull(driver.findElement(By.id("links-site")).findElements(By.linkText("About Wiley")));
//    Assert.assertNotNull(driver.findElement(By.id("links-site")).findElements(By.linkText("Contact Us")));
//    Assert.assertNotNull(driver.findElement(By.id("links-site")).findElements(By.linkText("Help")));
        driver.quit();


    }

    private WebElement getTheTopMenu(By id) {
        return driver.findElement(id);
    }

    @Test
    public void test2() {
        System.out.println("Test 2 started");
   //        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Students")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Authors")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Instructors")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Librarians")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Societies")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Conferences")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Booksellers")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Corporations")));
//        Assert.assertNotNull(driver.findElement(By.id("homepage-links")).findElement(By.linkText("Institutions")));

        Assert.assertTrue(driver.findElement(By.id("homepage-links")).findElements(By.tagName("a")).size() == 9);

        driver.quit();
    }


    @Test
    public void test3() {
        System.out.println("Test 3 started");


        driver.findElement(By.linkText("Students")).click();


        WebElement element;
        element = driver.findElement(By.cssSelector("div #page-title h1"));
        Assert.assertEquals(element.getText(), "Students");
        Assert.assertEquals(driver.getCurrentUrl(), "http://www.wiley.com/WileyCDA/Section/id-404702.html "); // тест крашится для всех регионов кроме Americas.
        driver.quit();


    }

    @Test
    public void test4() {
        System.out.println("Test 4 started");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.wiley.com/WileyCDA/");

        driver.findElement(By.linkText("Students")).click();


    }


}