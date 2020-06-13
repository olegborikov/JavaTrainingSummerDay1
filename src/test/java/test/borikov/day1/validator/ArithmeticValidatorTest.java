package test.borikov.day1.validator;

import com.borikov.day1.validator.ArithmeticValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticValidatorTest {
    ArithmeticValidator arithmeticValidator;

    @BeforeClass
    public void setUp() {
        arithmeticValidator = new ArithmeticValidator();
    }

    @DataProvider(name = "isNumberPositiveTrueData")
    public Object[][] createIsNumberPositiveTrueData() {
        return new Object[][]{
                {999.9},
                {1},
                {100}
        };
    }

    @Test(dataProvider = "isNumberPositiveTrueData")
    public void isNumberPositiveTrueTest(double number) {
        boolean actual = arithmeticValidator.isNumberPositive(number);
        assertTrue(actual);
    }

    @DataProvider(name = "isNumberPositiveFalseData")
    public Object[][] createIsNumberPositiveFalseData() {
        return new Object[][]{
                {1000},
                {0.0},
                {-301.1}
        };
    }

    @Test(dataProvider = "isNumberPositiveFalseData")
    public void isNumberPositiveFalseTest(double number) {
        boolean actual = arithmeticValidator.isNumberPositive(number);
        assertFalse(actual);
    }

    @DataProvider(name = "isLongNumberPositiveTrueData")
    public Object[][] createIsLongNumberPositiveTrueData() {
        return new Object[][]{
                {10000000000L},
                {1},
                {2131244532L}
        };
    }

    @Test(dataProvider = "isLongNumberPositiveTrueData")
    public void isLongNumberPositiveTrueTest(long number) {
        boolean actual = arithmeticValidator.isLongNumberPositive(number);
        assertTrue(actual);
    }

    @DataProvider(name = "isLongNumberPositiveFalseData")
    public Object[][] createIsLongNumberPositiveFalseData() {
        return new Object[][]{
                {100000000000L},
                {0},
                {-301}
        };
    }

    @Test(dataProvider = "isLongNumberPositiveFalseData")
    public void isLongNumberPositiveFalseTest(long number) {
        boolean actual = arithmeticValidator.isLongNumberPositive(number);
        assertFalse(actual);
    }

    @DataProvider(name = "isNumberInLimitPositiveData")
    public Object[][] createIsNumberInLimitPositiveData() {
        return new Object[][]{
                {999.99},
                {-999.9},
                {-123}
        };
    }

    @Test(dataProvider = "isNumberInLimitPositiveData")
    public void isNumberInLimitPositiveTest(double number) {
        boolean actual = arithmeticValidator.isNumberInLimit(number);
        assertTrue(actual);
    }

    @DataProvider(name = "isNumberInLimitNegativeData")
    public Object[][] createIsNumberInLimitNegativeData() {
        return new Object[][]{
                {1000},
                {43143},
                {-1000}
        };
    }

    @Test(dataProvider = "isNumberInLimitNegativeData")
    public void isNumberInLimitNegativeTest(double number) {
        boolean actual = arithmeticValidator.isNumberInLimit(number);
        assertFalse(actual);
    }

    @DataProvider(name = "isNumberBetweenPositiveData")
    public Object[][] createIsNumberBetweenPositiveData() {
        return new Object[][]{
                {1, 2, 1},
                {10, 1, -1.1},
                {1.0, 2.0, 0.1}
        };
    }

    @Test(dataProvider = "isNumberBetweenPositiveData")
    public void isNumberBetweenPositiveTest(double a, double b, double h) {
        boolean actual = arithmeticValidator.isNumberBetween(a, b, h);
        assertTrue(actual);
    }

    @DataProvider(name = "isNumberBetweenNegativeData")
    public Object[][] createIsNumberBetweenNegativeData() {
        return new Object[][]{
                {1, 1, 1},
                {1, 10.0, -2},
                {10, 1, 1}
        };
    }

    @Test(dataProvider = "isNumberBetweenNegativeData")
    public void isNumberBetweenNegativeTest(double a, double b, double h) {
        boolean actual = arithmeticValidator.isNumberBetween(a, b, h);
        assertFalse(actual);
    }

    @DataProvider(name = "isArrayInLimitPositiveData")
    public Object[][] createIsArrayInLimitPositiveData() {
        return new Object[][]{
                {new int[]{-100, 100, 0}},
                {new int[]{-999, 999, 103}},
                {new int[]{100, 200, 300}}
        };
    }

    @Test(dataProvider = "isArrayInLimitPositiveData")
    public void isArrayInLimitPositiveTest(int... arr) {
        boolean actual = arithmeticValidator.isArrayInLimit(arr);
        assertTrue(actual);
    }

    @DataProvider(name = "isArrayInLimitNegativeData")
    public Object[][] createIsArrayInLimitNegativeData() {
        return new Object[][]{
                {new int[]{-1000, 1000, 321321}},
                {new int[]{123123,321133, -111111}},
                {new int[]{766551, 3233, 6312}}
        };
    }

    @Test(dataProvider = "isArrayInLimitNegativeData")
    public void isArrayInLimitNegativeTest(int... arr) {
        boolean actual = arithmeticValidator.isArrayInLimit(arr);
        assertFalse(actual);
    }
}
