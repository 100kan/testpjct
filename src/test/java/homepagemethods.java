package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class homepagemethods {

    WebDriver driver = new ChromeDriver();
    //постоянные
    public static final String HOME_URL = "http://www.wiley.com/WileyCDA/";

//методы для Navigation Menu
    private WebElement homePageTopNavMenu(){
        return driver.findElement(By.cssSelector("#links-site>ul"));
    }
    protected WebElement homePageTopNavMenuHomeButton(){
        return homePageTopNavMenu().findElement(By.xpath(".//a[text() = 'Home']"));
    }
    protected WebElement homePageTopNavMenuSubjectsButton() {
        return homePageTopNavMenu().findElement(By.xpath(".//a[text() = 'Subjects']"));
    }
    protected WebElement homePageTopNavMenuAboutWileyButton() {
        return homePageTopNavMenu().findElement(By.xpath(".//a[text() = 'About Wiley']"));
    }
    protected WebElement homePageTopNavMenuContactUsButton() {
        return homePageTopNavMenu().findElement(By.xpath(".//a[text() = 'Contact Us']"));
    }
    protected WebElement homePageTopNavMenuHelpButton() {
        return homePageTopNavMenu().findElement(By.xpath(".//a[text() = 'Help']"));
    }
    protected void checkElementIsDisplayed(WebElement element){
        Assert.assertTrue(element.isDisplayed());
    }
// методы для sub-header
private WebElement homePageResourseSubHeader() {
    return driver.findElement(By.cssSelector("div#homepage-resources"));
}
    protected void checkCorrectTitles(String title, WebElement element){
        Assert.assertEquals(title, element.getText());
    }


    protected void  checkCountItemsAtResourseSubHeader(){
        Assert.assertTrue(homePageResourseSubHeader().
                findElements(By.cssSelector("div#homepage-links a")).size() == 9);
    }

    protected WebElement homePageResourseSubHeaderStudentsButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-students a"));
    }

    protected WebElement homePageResourseSubHeaderAuthorsButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-authors a"));
    }
    protected WebElement homePageResourseSubHeaderInstructorsButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-instructors a"));
    }
    protected WebElement homePageResourseSubHeaderLibrariansButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-librarians a"));
    }

    protected WebElement homePageResourseSubHeaderSocietiesButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.last.resource-societies a"));
    }
    protected WebElement homePageResourseSubHeaderConferencesButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-conferences a"));
    }
    protected WebElement homePageResourseSubHeaderBooksellersButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-booksellers a"));
    }
    protected WebElement homePageResourseSubHeaderCorporationsButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-corporate a"));
    }
    protected WebElement homePageResourseSubHeaderInstitutionsButton(){
        return homePageResourseSubHeader().findElement(By.cssSelector("li.resource-institutions a"));
    }


}
