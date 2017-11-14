import org.junit.*;

public class task_tests extends Homepage {

    @Test
    public void test_1() {
        getHomepage();
        Assert.assertTrue(getHomeLink().isDisplayed());
    }
}