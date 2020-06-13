package test.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.service.FunctionService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class FunctionServiceTest {
    FunctionService functionService;

    @BeforeClass
    public void setUp() {
        functionService = new FunctionService();
    }

    @DataProvider(name = "createGetCustomFunctionPositiveData")
    public Object[][] createGetCustomFunctionPositiveData() {
        return new Object[][]{
                {5, -1},
                {0, -0.16},
                {3, 9}
        };
    }

    @Test(dataProvider = "createGetCustomFunctionPositiveData")
    public void getCustomFunctionPositiveTest(double number, double expected) {
        try {
            double actual = functionService.getCustomFunction(number);
            assertEquals(actual, expected, 0.01);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetCustomFunctionNegativeData")
    public Object[][] createGetCustomFunctionNegativeData() {
        return new Object[][]{
                {5, 20},
                {0, 0.16},
                {3, -9}
        };
    }

    @Test(dataProvider = "createGetCustomFunctionNegativeData")
    public void getCustomFunctionNegativeTest(double number, double expected) {
        try {
            double actual = functionService.getCustomFunction(number);
            assertNotEquals(actual, expected, 0.01);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetCustomFunctionExceptionData")
    public Object[][] createGetCustomFunctionExceptionData() {
        return new Object[][]{
                {1000},
                {-1000},
                {33213}
        };
    }

    @Test(dataProvider = "createGetCustomFunctionExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void getCustomFunctionExceptionTest(
            double number) throws IncorrectDataException {
        functionService.getCustomFunction(number);
    }

    @DataProvider(name = "createGetTangentFunctionPositiveData")
    public Object[][] createGetTangentFunctionPositiveData() {
        return new Object[][]{
                {1, 5, 1, new HashMap<Double, Double>() {{
                    put(1.0, 1.55);
                    put(2.0, -2.18);
                    put(3.0, -0.14);
                    put(4.0, 1.15);
                    put(5.0, -3.38);
                }}},
                {5, 1, -1, new HashMap<Double, Double>() {{
                    put(5.0, -3.38);
                    put(4.0, 1.15);
                    put(3.0, -0.14);
                    put(2.0, -2.18);
                    put(1.0, 1.55);
                }}},
                {0, 6, 2.5, new HashMap<Double, Double>() {{
                    put(0.0, 0.0);
                    put(2.5, -0.74);
                    put(5.0, -3.38);
                }}}
        };
    }

    @Test(dataProvider = "createGetTangentFunctionPositiveData")
    public void getTangentFunctionPositiveTest(double a, double b, double h, Map<Double, Double> expected) {
        try {
            Map<Double, Double> actual = functionService.getTangentFunction(a, b, h);
            assertEquals(actual,expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetTangentFunctionNegativeData")
    public Object[][] createGetTangentFunctionNegativeData() {
        return new Object[][]{
                {1, 5, 1, new HashMap<Double, Double>() {{
                    put(1.0, 1.5);
                    put(2.0, -2.18);
                    put(3.0, -0.14);
                    put(4.0, 1.15);
                    put(5.0, -3.38);
                }}},
                {5, 1, -1, new HashMap<Double, Double>() {{
                    put(5.0, 3.38);
                    put(4.0, 1.1);
                    put(3.0, -0.1);
                    put(2.0, 2.18);
                    put(1.0, 1.5);
                }}},
                {0, 6, 2.5, new HashMap<Double, Double>() {{
                    put(0.0, 1.0);
                    put(2.5, 3.4);
                    put(5.0, 2.18);
                }}}
        };
    }

    @Test(dataProvider = "createGetTangentFunctionNegativeData")
    public void getTangentFunctionNegativeTest(double a, double b, double h, Map<Double, Double> expected) {
        try {
            Map<Double, Double> actual = functionService.getTangentFunction(a, b, h);
            assertNotEquals(actual,expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetTangentFunctionExceptionData")
    public Object[][] createGetTangentFunctionExceptionData() {
        return new Object[][]{
                {1000, 1, 0},
                {10, 2, 3},
                {1, 3, -1}
        };
    }

    @Test(dataProvider = "createGetTangentFunctionExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void getTangentFunctionExceptionTest(int a, int b, int h) throws IncorrectDataException {
        functionService.getTangentFunction(a, b, h);
    }
}
