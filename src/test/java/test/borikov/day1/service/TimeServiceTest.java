package test.borikov.day1.service;

import com.borikov.day1.service.TimeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeServiceTest {
    TimeService timeService;

    @BeforeClass
    public void setUp() {
        timeService = new TimeService();
    }

    @Test
    public void testGetDaysByYearAndMonth() {
    }

    @Test
    public void testGetTimeBySeconds() {
    }
}
