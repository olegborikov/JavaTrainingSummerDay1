package test.borikov.day1.service;

import com.borikov.day1.entity.Point;
import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.service.PointService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {
    PointService pointService;

    @BeforeClass
    public void setUp() {
        pointService = new PointService();
    }

    @DataProvider(name = "isPointInLimitPositiveData")
    public Object[][] createIsPointInLimitPositiveData() {
        return new Object[][]{
                {new Point("first", 2, 3),
                        new Point("second", 1.1, 1),
                        new Point("second", 1.1, 1),},
                {new Point("first", 2, 3),
                        new Point("second", 7, 5),
                        new Point("first", 2, 3),},
                {new Point("first", 1, 1),
                        new Point("second", 1, 1),
                        new Point("second", 1, 1),}
        };
    }

    @Test(dataProvider = "isPointInLimitPositiveData")
    public void isPointInLimitPositiveTest(Point first,
                                           Point second, Point expected) {
        try {
            Point actual = pointService.getNearestPoint(first, second);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "isPointInLimitNegativeData")
    public Object[][] createIsPointInLimitNegativeData() {
        return new Object[][]{
                {new Point("first", 2.1, 3),
                        new Point("second", 1, 1),
                        new Point("first", 2, 3),},
                {new Point("first", 2, 3),
                        new Point("second", 7, 5.6),
                        new Point("second", 7, 5),},
                {new Point("first", 1, 1),
                        new Point("second", 1, 1),
                        new Point("third", 1, 1),}
        };
    }

    @Test(dataProvider = "isPointInLimitNegativeData")
    public void isPointInLimitNegativeTest(Point first, Point second,
                                           Point expected) {
        try {
            Point actual = pointService.getNearestPoint(first, second);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createIsPointInLimitExceptionData")
    public Object[][] createIsPointInLimitExceptionData() {
        return new Object[][]{
                {new Point("first", 1000, 3),
                        new Point("second", 1, 1)},
                {new Point("first", -100, 3),
                        new Point("second", 7, 5.6)},
                {new Point("first", 100, 1),
                        new Point("second", 1, 100)}
        };
    }

    @Test(dataProvider = "createIsPointInLimitExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void isPointInLimitExceptionTest(
            Point first, Point second) throws IncorrectDataException {
        pointService.getNearestPoint(first, second);
    }
}
