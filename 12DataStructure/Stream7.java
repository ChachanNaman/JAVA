import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream7 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,12, 2, 34);

        // Stream<Integer> s1 = nums.stream(); //will store as stream in s1 
        // //can be used only once as its stream

        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0); //filter the even numbers

        // Stream<Integer> s3 = s2.map(n -> n*2);


        Stream<Integer> f1 = nums.stream()
                                .filter(n -> n%2==0)
                                .map(n -> n*2);

        int result = nums.stream()
                     .filter(n -> n%2==0)
                     .map(n -> n*2)
                     .reduce(0, (c,e) -> c+e);

        f1.forEach(n -> System.out.println(n));
        System.out.println(result);
    }
}
