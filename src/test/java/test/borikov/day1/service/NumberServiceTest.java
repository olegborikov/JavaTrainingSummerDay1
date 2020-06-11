package test.borikov.day1.service;

import com.borikov.day1.exception.IncorrectDataException;
import com.borikov.day1.service.NumberService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    NumberService numberService;

    @BeforeClass
    public void setUp() {
        numberService = new NumberService();
    }

    @Test
    public void testGetLastNumberOfSquare() {
        try {
            int a = numberService.getLastNumberOfSquare(-5);
        } catch (IncorrectDataException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIsTwoNumbersEven() {
    }

    @Test
    public void testIsNumberPerfect() {
    }
}
