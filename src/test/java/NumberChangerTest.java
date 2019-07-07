import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberChangerTest
{
    NumberChanger numberChange;
    @Test
    @Parameters({
            "1, 1",
            "4, 4",
            "3, Fizz",
            "5, Fizz",
            "15, FizzBuzz"
    })

    public void notChangeNumberTest(int input, String expected)
    {
        assertEquals(expected, NumberChanger.changeNumber(input));
    }

    @Before
    public void before()
    {
        numberChange = new NumberChanger();
    }


}
