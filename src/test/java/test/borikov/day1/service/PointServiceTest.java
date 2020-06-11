package test.borikov.day1.service;

import com.borikov.day1.service.PointService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointServiceTest {
    PointService pointService;

    @BeforeClass
    public void setUp() {
        pointService = new PointService();
    }

    @Test
    public void testGetNearestPoint() {
    }
}
