import java.util.Scanner;

public class NumberChanger
{
    public static String changeNumber(Integer input)
    {
        if (input.intValue() % 3 == 0)
        {
            return "Fizz";
        }
        if (input.intValue() % 5 == 0)
        {
            return "Buzz";
        }
        if (input.intValue() % 15 == 0)
        {
            return "Fizz";
        }
        else
        {
            return input.toString();
        }
    }

    public static void go()
    {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
    }
    public static void main(String[] args)
    {

    }
}
