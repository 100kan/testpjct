package tests;

import org.junit.After;

import org.junit.Test;

import static tests.homepagemethods.HOME_URL;


public class testrun extends tests.resoursesForStudent {

    private void nextStep(String text) {
        System.out.println(text);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void test1() {
        nextStep("Open http://www.wiley.com/WileyCDA/");

        driver.get(HOME_URL);

        nextStep("Check the following links displayed in top navigation menu");

        checkElementIsDisplayed(homePageTopNavMenuHomeButton());
        checkElementIsDisplayed(homePageTopNavMenuSubjectsButton());
        checkElementIsDisplayed(homePageTopNavMenuAboutWileyButton());
        checkElementIsDisplayed(homePageTopNavMenuContactUsButton());
        checkElementIsDisplayed(homePageTopNavMenuHelpButton());

        nextStep("Check items under Resources sub-header");
        nextStep("Check are 9 items under resources sub-header");

        checkCountItemsAtResourseSubHeader();

        nextStep("Check Titles resources sub-header");


        checkCorrectTitles("Students", homePageResourseSubHeaderStudentsButton());
        checkCorrectTitles("Authors", homePageResourseSubHeaderAuthorsButton());
        checkCorrectTitles("Instructors", homePageResourseSubHeaderInstructorsButton());
        checkCorrectTitles("Librarians", homePageResourseSubHeaderLibrariansButton());
        checkCorrectTitles("Societies", homePageResourseSubHeaderSocietiesButton());
        checkCorrectTitles("Conferences", homePageResourseSubHeaderConferencesButton());
        checkCorrectTitles("Booksellers", homePageResourseSubHeaderBooksellersButton());
        checkCorrectTitles("Corporations", homePageResourseSubHeaderCorporationsButton());
        checkCorrectTitles("Institutions", homePageResourseSubHeaderInstitutionsButton());


        nextStep("Click “Students” item");
        homePageResourseSubHeaderStudentsButton().click();

        nextStep("Check that http://www.wiley.com/WileyCDA/Section/id-404702.html url is opened");

      checkCurrentUrl(RESOURSES_STUDENT_URL); // из за региона URL разный. Тест PASS только для региона Americas


    }

}
