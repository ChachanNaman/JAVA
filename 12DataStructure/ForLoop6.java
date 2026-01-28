/*
Can use 3 types of for loop -> normal forloop , enhanced for loop , Foreach(best)
 */

import java.util.Arrays;
import java.util.List;

public class ForLoop6 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,1,8,2);

        //Normal For loop 
        for(int i = 0; i < nums.size() ; i++){
            System.out.println(nums.get(i));
        }

        System.out.println();

        //Enhanced For loop
        for(int n : nums){
            System.out.println(n);
        }

        System.out.println();
        
        //ForEach
        nums.forEach(n -> System.out.println(n));
    }
}
