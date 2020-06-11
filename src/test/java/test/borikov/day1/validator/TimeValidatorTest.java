package test.borikov.day1.validator;

import com.borikov.day1.validator.TimeValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeValidatorTest {
    TimeValidator timeValidator;

    @BeforeClass
    public void setUp() {
        timeValidator = new TimeValidator();
    }

    @DataProvider(name = "isSecondsInLimitPositiveData")
    public Object[][] createIsSecondsInLimitPositiveData() {
        return new Object[][]{
                {1000},
                {1},
                {86399}
        };
    }

    @Test(dataProvider = "isSecondsInLimitPositiveData")
    public void testIsSecondsInLimitPositive(int seconds) {
        boolean actual = timeValidator.isSecondsInLimit(seconds);
        assertTrue(actual);
    }

    @DataProvider(name = "isSecondsInLimitNegativeData")
    public Object[][] createIsSecondsInLimitNegativeData() {
        return new Object[][]{
                {86400},
                {0},
                {-10000}
        };
    }

    @Test(dataProvider = "isSecondsInLimitNegativeData")
    public void testIsSecondsInLimitNegative(int seconds) {
        boolean actual = timeValidator.isSecondsInLimit(seconds);
        assertFalse(actual);
    }

    @DataProvider(name = "isYearInLimitPositiveData")
    public Object[][] createIsYearInLimitPositiveData() {
        return new Object[][]{
                {1000},
                {1},
                {4999}
        };
    }

    @Test(dataProvider = "isYearInLimitPositiveData")
    public void testIsYearInLimitPositive(int year) {
        boolean actual = timeValidator.isYearInLimit(year);
        assertTrue(actual);
    }

    @DataProvider(name = "isYearInLimitNegativeData")
    public Object[][] createIsYearInLimitNegativeData() {
        return new Object[][]{
                {5000},
                {0},
                {-100}
        };
    }

    @Test(dataProvider = "isYearInLimitNegativeData")
    public void testIsYearInLimitNegative(int year) {
        boolean actual = timeValidator.isYearInLimit(year);
        assertFalse(actual);
    }

    @DataProvider(name = "isMonthInLimitPositiveData")
    public Object[][] createIsMonthInLimitPositiveData() {
        return new Object[][]{
                {12},
                {1},
                {3}
        };
    }

    @Test(dataProvider = "isMonthInLimitPositiveData")
    public void testIsMonthInLimitPositive(int month) {
        boolean actual = timeValidator.isMonthInLimit(month);
        assertTrue(actual);
    }

    @DataProvider(name = "isMonthInLimitNegativeData")
    public Object[][] createIsMonthInLimitNegativeData() {
        return new Object[][]{
                {13},
                {0},
                {-100}
        };
    }

    @Test(dataProvider = "isMonthInLimitNegativeData")
    public void testIsMonthInLimitNegative(int month) {
        boolean actual = timeValidator.isMonthInLimit(month);
        assertFalse(actual);
    }
}
