import org.openqa.selenium.*;

import static org.junit.Assert.assertEquals;

public class Homepage extends BaseTest {

    private String HOMEPAGE_URL = "http://www.wiley.com/";

    public WebElement getSubjectsLink() {
        return getLinkSite().findElement(By.xpath("//a[text()='Subjects']"));
    }

    public WebElement getLinkSite() {
        return driver.findElement(By.cssSelector("div[id='links-site']"));
    }

    public void getHomepage() {
        driver.get(HOMEPAGE_URL);
    }

    public void clickHomepageLink() {
        getHomeLink().click();
    }

    public WebElement getHomeLink() {
        return getLinkSite().findElement(By.xpath("//a[text()='Home']"));
    }

    public void checkCurrentUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }
}