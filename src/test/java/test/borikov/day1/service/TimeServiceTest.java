package test.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.service.TimeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeServiceTest {
    TimeService timeService;

    @BeforeClass
    public void setUp() {
        timeService = new TimeService();
    }

    @DataProvider(name = "getDaysByYearAndMonthPositiveData")
    public Object[][] createGetDaysByYearAndMonthPositiveData() {
        return new Object[][]{
                {2020, 6, 30},
                {2020, 2, 29},
                {2018, 2, 28}
        };
    }

    @Test(dataProvider = "getDaysByYearAndMonthPositiveData")
    public void getDaysByYearAndMonthPositiveTest(
            int year, int month, int expected) {
        try {
            int actual = timeService.getDaysByYearAndMonth(year, month);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "getDaysByYearAndMonthNegativeData")
    public Object[][] createGetDaysByYearAndMonthNegativeData() {
        return new Object[][]{
                {2020, 6, 31},
                {2020, 2, 28},
                {2018, 2, 29}
        };
    }

    @Test(dataProvider = "getDaysByYearAndMonthNegativeData")
    public void getDaysByYearAndMonthNegativeTest(
            int year, int month, int expected) {
        try {
            int actual = timeService.getDaysByYearAndMonth(year, month);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetDaysByYearAndMonthExceptionData")
    public Object[][] createGetDaysByYearAndMonthExceptionData() {
        return new Object[][]{
                {-5, 6},
                {0, 15},
                {5000, 2}
        };
    }

    @Test(dataProvider = "createGetDaysByYearAndMonthExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void getDaysByYearAndMonthExceptionTest(
            int year, int month) throws IncorrectDataException {
        timeService.getDaysByYearAndMonth(year, month);
    }

    @DataProvider(name = "getTimeBySecondsPositiveData")
    public Object[][] getTimeBySecondsPositiveData() {
        return new Object[][]{
                {10000, "2:46:40"},
                {50000, "13:53:20"},
                {86399, "23:59:59"}
        };
    }

    @Test(dataProvider = "getTimeBySecondsPositiveData")
    public void getTimeBySecondsPositiveTest(int seconds, String expected) {
        try {
            String actual = timeService.getTimeBySeconds(seconds);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "getTimeBySecondsNegativeData")
    public Object[][] getTimeBySecondsNegativeData() {
        return new Object[][]{
                {40000, "2:46:40"},
                {100, "0:0:60"},
                {86399, "23:59:58"}
        };
    }

    @Test(dataProvider = "getTimeBySecondsNegativeData")
    public void getTimeBySecondsNegativeTest(int seconds, String expected) {
        try {
            String actual = timeService.getTimeBySeconds(seconds);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "getTimeBySecondsExceptionData")
    public Object[][] getTimeBySecondsExceptionData() {
        return new Object[][]{
                {-100},
                {0},
                {86400}
        };
    }

    @Test(dataProvider = "getTimeBySecondsExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void getTimeBySecondsExceptionTest(
            int seconds) throws IncorrectDataException {
        timeService.getTimeBySeconds(seconds);
    }
}
