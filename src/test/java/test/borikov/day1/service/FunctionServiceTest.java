package test.borikov.day1.service;

import com.borikov.day1.service.FunctionService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionServiceTest {
    FunctionService functionService;

    @BeforeClass
    public void setUp() {
        functionService = new FunctionService();
    }

    @Test
    public void testGetCustomFunction() {
    }

    @Test
    public void testGetTangentFunction() {
    }
}
