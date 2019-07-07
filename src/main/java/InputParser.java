public class InputParser
{
    NumberChanger numberChanger;

    public InputParser(NumberChanger numberChanger)
    {
        this.numberChanger = new NumberChanger();
    }

    public String Changeinput(Integer a, Integer b, Integer c)
    {

        String toReturn = "";

        toReturn = toReturn +
                this.numberChanger.changeNumber(a) + "";
        toReturn = toReturn +
                this.numberChanger.changeNumber(b) + "";
        toReturn = toReturn +
                this.numberChanger.changeNumber(c) + "";
        return toReturn;
    }
}
