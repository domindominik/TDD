public class NumberChargerToFizzBuzz
{
    public static String changeNumber(Integer input)
    {
        if ((input.intValue() % 3 == 0) || (input.intValue() % 5 == 0))
        {
            return "FizzBuzz";
        }
        else
        {
            return input.toString();
        }
    }
}
