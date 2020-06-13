package test.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.service.ShapeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeServiceTest {
    ShapeService shapeService;

    @BeforeClass
    public void setUp() {
        shapeService = new ShapeService();
    }

    @DataProvider(name = "createGetAreaOfInscribedSquarePositiveData")
    public Object[][] createGetAreaOfInscribedSquarePositiveData() {
        return new Object[][]{
                {25, 2},
                {36, 2},
                {9, 2}
        };
    }

    @Test(dataProvider = "createGetAreaOfInscribedSquarePositiveData")
    public void getAreaOfInscribedSquarePositiveTest(
            double areaOfDescribedSquare, double expected) {
        try {
            double actual = shapeService.getAreaOfInscribedSquare(areaOfDescribedSquare);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetAreaOfInscribedSquareNegativeData")
    public Object[][] createGetAreaOfInscribedSquareNegativeData() {
        return new Object[][]{
                {25, 3},
                {36, 3},
                {9, 3}
        };
    }

    @Test (dataProvider = "createGetAreaOfInscribedSquareNegativeData")
    public void getAreaOfInscribedSquareNegativeTest(
    double areaOfDescribedSquare, double expected) {
        try {
            double actual = shapeService.getAreaOfInscribedSquare(areaOfDescribedSquare);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetAreaOfInscribedSquareExceptionData")
    public Object[][] createGetAreaOfInscribedSquareExceptionData() {
        return new Object[][]{
                {-10},
                {0},
                {1000}
        };
    }

    @Test(dataProvider = "createGetAreaOfInscribedSquareExceptionData",
            expectedExceptions = IncorrectDataException.class)
    public void getAreaOfInscribedSquareExceptionTest(
            double areaOfDescribedSquare) throws IncorrectDataException{
        shapeService.getAreaOfInscribedSquare(areaOfDescribedSquare);
    }

    @DataProvider(name = "createGetLengthAndSquareOfCirclePositiveData")
    public Object[][] createGetLengthAndSquareOfCirclePositiveData() {
        return new Object[][]{
                {5, new double[]{31.41, 78.53}},
                {2, new double[]{12.56, 12.56}},
                {1, new double[]{6.28, 3.14}},
        };
    }

    @Test(dataProvider = "createGetLengthAndSquareOfCirclePositiveData")
    public void getLengthAndSquareOfCirclePositiveTest(double radius, double[] expected) {
        try {
            double[] actual = shapeService.getLengthAndSquareOfCircle(radius);
            assertEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetLengthAndSquareOfCircleNegativeData")
    public Object[][] createGetLengthAndSquareOfCircleNegativeData() {
        return new Object[][]{
                {3, new double[]{1, 2}},
                {1, new double[]{3, 12.56}},
                {10, new double[]{5, 3.14}},
        };
    }

    @Test(dataProvider = "createGetLengthAndSquareOfCircleNegativeData")
    public void getLengthAndSquareOfCircleNegativeTest(double radius, double[] expected) {
        try {
            double[] actual = shapeService.getLengthAndSquareOfCircle(radius);
            assertNotEquals(actual, expected);
        } catch (IncorrectDataException e) {
            fail("input exception");
        }
    }

    @DataProvider(name = "createGetLengthAndSquareOfCircleExceptionData")
    public Object[][] createGetLengthAndSquareOfCircleExceptionData() {
        return new Object[][]{
                {-167},
                {1000},
                {0}
        };
    }

    @Test(dataProvider = "createGetLengthAndSquareOfCircleExceptionData",
    expectedExceptions = IncorrectDataException.class)
    public void getLengthAndSquareOfCircleExceptionTest(
            double radius) throws IncorrectDataException {
        shapeService.getLengthAndSquareOfCircle(radius);
    }
}
