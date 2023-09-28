import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double total=0;
        for (Integer number: numbers){
            total += number;
        }
        return total/numbers.size();
    }
}