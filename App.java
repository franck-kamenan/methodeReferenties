package be.intecbrussel.lambda.methodeReferenties;

import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        // Static Method Reference
        List<Integer> numbers = Arrays.asList(1, 4, 5);

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }

        System.out.println();

        for (Integer i : numbers)
        {
            System.out.println(i);
        }

        System.out.println();

        numbers.forEach(System.out::println);  // HERE

        System.out.println();

        // Instance Method Reference -> OBJECT
        FaultySoftware bug = new FaultySoftware();
        numbers.forEach(bug::printAllNumbers);  // HERE
    }


}
