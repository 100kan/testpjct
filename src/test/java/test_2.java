import org.junit.Test;

public class test_2 extends Homepage {

    private static final String HOME_LINK_URL = "http://eu.wiley.com/WileyCDA/";

    @Test
    public void test_123() {
        getHomepage();
        clickHomepageLink();
        checkCurrentUrl(HOME_LINK_URL);
    }
}