package test.borikov.day1.validator;

import com.borikov.day1.entity.Point;
import com.borikov.day1.validator.PointValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointValidatorTest {
    PointValidator pointValidator;

    @BeforeClass
    public void setUp() {
        pointValidator = new PointValidator();
    }

    @DataProvider(name = "isPointInLimitPositiveData")
    public Object[][] createIsPointInLimitPositiveData() {
        return new Object[][]{
                {1.0, 1.0},
                {99.99, -99.99},
                {5, 25}
        };
    }

    @Test(dataProvider = "isPointInLimitPositiveData")
    public void testIsPointInLimitPositive(double x, double y) {
        boolean actual = pointValidator.isPointInLimit(x, y);
        assertTrue(actual);
    }

    @DataProvider(name = "isPointInLimitNegativeData")
    public Object[][] createIsPointInLimitNegativeData() {
        return new Object[][]{
                {100, 100},
                {1234, -32132},
                {100, -100}
        };
    }

    @Test(dataProvider = "isPointInLimitNegativeData")
    public void testIsPointInLimitNegative(double x, double y) {
        boolean actual = pointValidator.isPointInLimit(x, y);
        assertFalse(actual);
    }
}
