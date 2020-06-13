package test.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.service.NumberService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    NumberService numberService;

    @BeforeClass
    public void setUp() {
        numberService = new NumberService();
    }

    @DataProvider(name = "createGetLastNumberOfSquarePositiveData")
    public Object[][] createGetLastNumberOfSquarePositiveData() {
        return new Object[][]{
                {7, 9},
                {0, 0},
                {3, 9}
        };
    }

    @Test(dataProvider = "createGetLastNumberOfSquarePositiveData")
    public void getLastNumberOfSquarePositiveTest(int number, int expected) {
        try {
            int actual = numberService.getLastNumberOfSquare(number);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetLastNumberOfSquareNegativeData")
    public Object[][] createGetLastNumberOfSquareNegativeData() {
        return new Object[][]{
                {7, 7},
                {0, 1},
                {3, 2}
        };
    }

    @Test(dataProvider = "createGetLastNumberOfSquareNegativeData")
    public void getLastNumberOfSquareNegativeTest(int number, int expected) {
        try {
            int actual = numberService.getLastNumberOfSquare(number);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetLastNumberOfSquareExceptionData")
    public Object[][] createGetLastNumberOfSquareExceptionData() {
        return new Object[][]{
                {1000},
                {-1000},
                {12345}
        };
    }

    @Test(dataProvider = "createGetLastNumberOfSquareExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void getLastNumberOfSquareExceptionTest(int number)
            throws IncorrectDataException {
        numberService.getLastNumberOfSquare(number);
    }

    @DataProvider(name = "createIsTwoNumbersEvenPositiveData")
    public Object[][] createIsTwoNumbersEvenPositiveData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4}, true},
                {new int[]{2, 2, 3, 1, 6, 7}, true},
                {new int[]{1, 5, 8, 1, 6, 7}, true}
        };
    }

    @Test(dataProvider = "createIsTwoNumbersEvenPositiveData")
    public void isTwoNumbersEvenPositiveTest(int[] arr, boolean expected) {
        try {
            boolean actual = numberService.isTwoNumbersEven(arr);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createIsTwoNumbersEvenNegativeData")
    public Object[][] createIsTwoNumbersEvenNegativeData() {
        return new Object[][]{
                {new int[]{1, 1, 3, 1}, true},
                {new int[]{5, 9, 3, 1, 7}, true},
                {new int[]{1, 5, 3, 1, 6, 7}, true}
        };
    }

    @Test(dataProvider = "createIsTwoNumbersEvenNegativeData")
    public void isTwoNumbersEvenNegativeTest(int[] arr, boolean expected) {
        try {
            boolean actual = numberService.isTwoNumbersEven(arr);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createIsTwoNumbersEvenExceptionData")
    public Object[][] createIsTwoNumbersEvenExceptionData() {
        return new Object[][]{
                {new int[]{1}},
                {new int[]{5, 9, 3}},
                {new int[]{}}
        };
    }

    @Test(dataProvider = "createIsTwoNumbersEvenExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void isTwoNumbersEvenExceptionTest(int[] arr)
            throws IncorrectDataException {
        numberService.isTwoNumbersEven(arr);
    }

    @DataProvider(name = "createIsNumberPerfectPositiveData")
    public Object[][] createIsNumberPerfectPositiveData() {
        return new Object[][]{
                {6, true},
                {8128, true},
                {33_550_336L, true}
        };
    }

    @Test(dataProvider = "createIsNumberPerfectPositiveData")
    public void isNumberPerfectPositiveTest(long number, boolean expected) {
        try {
            boolean actual = numberService.isNumberPerfect(number);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createIsNumberPerfectNegativeData")
    public Object[][] createIsNumberPerfectNegativeData() {
        return new Object[][]{
                {4, true},
                {100, true},
                {32145, true}
        };
    }

    @Test(dataProvider = "createIsNumberPerfectNegativeData")
    public void isNumberPerfectNegativeTest(long number, boolean expected) {
        try {
            boolean actual = numberService.isNumberPerfect(number);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createIsNumberPerfectExceptionData")
    public Object[][] createIsNumberPerfectExceptionData() {
        return new Object[][]{
                {0},
                {-100},
                {-1000}
        };
    }

    @Test(dataProvider = "createIsNumberPerfectExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void isNumberPerfectExceptionTest(
            long number) throws IncorrectDataException{
        numberService.isNumberPerfect(number);
    }
}
