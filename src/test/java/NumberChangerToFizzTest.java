import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberChangerToFizzTest
{
    @Test
    @Parameters({"3, Fizz"})
    public void numberDividedByThreeChangeToFizz(int input, String expected)
    {
        assertEquals(expected, NumberChanger.changeNumber(input));
    }

}

