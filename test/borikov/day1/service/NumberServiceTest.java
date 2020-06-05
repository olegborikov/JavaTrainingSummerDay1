package borikov.day1.service;

import com.borikov.day1.service.NumberService;
import org.junit.Assert;
import org.junit.Test;


public class NumberServiceTest {

    @Test
    public void getLastNumberOfSquare() {
        int expected = new NumberService().getLastNumberOfSquare(11);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }
}
