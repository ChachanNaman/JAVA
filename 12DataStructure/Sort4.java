import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
    
public class Sort4 {
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(78);
        nums.add(12);
        nums.add(43);
        nums.add(34);


        Collections.sort(nums ,com);  // to sort the number from last digit 
        System.out.println(nums);

    }
}
