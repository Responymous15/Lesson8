public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Create series1 with firstMember-2, difference-2");
        ArithmeticProgression series1 = new ArithmeticProgression(2, 2);

        System.out.println("Series1 First Member: " + series1.get_firstMember() + "\nSeries1 Difference: " + series1.get_difference());

        series1.printGeneralSeries();
        int x = series1.memberCalculation(4);
        int n = series1.calculate(4);

        System.out.println("Series1: x (4) = " + x);
        System.out.println("Series1: n (4) = " + n);

        System.out.println("Create series 2 by copying series1");
        ArithmeticProgression series2 = new ArithmeticProgression(series1);

        System.out.println("Series2 First Member: " + series2.get_firstMember() + "\nSeries2 Difference: " + series2.get_difference());

        System.out.println("Change difference of series2");
        series2.set_difference(5);

        System.out.println("Series2 Difference: " + series2.get_difference());


        System.out.println("Check with smallDiff function if series1 difference smaller than series2 difference");

        if (series2.smallDiff(series1))
        {
            System.out.println("Difference of series1 smaller");
        }
        else
        {
            System.out.println("Difference of series1 bigger");
        }




    }
}