import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        int[] array = {23, 67, 455, 1, -66, 0, -34, 78, 67};

        //1
        double average1 = IntStream.of(array)
                .average().getAsDouble();
        System.out.println("Average = "+average1);
        double average2 = (double) IntStream.of(array)
                .sum()/array.length;
        System.out.println("Average = "+average2);

        //2
        System.out.println(IntStream.of(IntStream.of(array).min().getAsInt(),
        IntStream.of(array).boxed()
                .collect(Collectors.toList()).
        indexOf(IntStream.of(array).min().getAsInt())).boxed()
                .collect(Collectors.toList()));

        //3
        long count1 = IntStream.of(array)
                .filter(x -> x == 0)
                .count();
        System.out.println("Amount of zero element: "+count1);

        //4
        long count2 = IntStream.of(array)
                .filter(x -> x > 0)
                .count();
        System.out.println("Amount of elements >0:"+count2);

        //5
        int multiply = 10;
        System.out.println("Multiply elements:");
        IntStream.of(array)
                .map(x -> x*multiply)
                .forEach(System.out::println);
    }
}
