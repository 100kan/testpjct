package tests;

import org.junit.Assert;

public class resoursesForStudent extends homepagemethods {

    //постоянные
    public static final String RESOURSES_STUDENT_URL = "http://www.wiley.com/WileyCDA/Section/id-404702.html ";

    protected void checkCurrentUrl(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

}