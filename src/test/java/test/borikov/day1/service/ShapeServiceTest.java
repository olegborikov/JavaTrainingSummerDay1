package test.borikov.day1.service;

import com.borikov.day1.service.ShapeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeServiceTest {
    ShapeService shapeService;

    @BeforeClass
    public void setUp() {
        shapeService = new ShapeService();
    }

    @Test
    public void testGetAreaOfInscribedSquare() {
    }

    @Test
    public void testGetLengthAndSquareOfCircle() {
    }
}
