/*
Collection interface - 
List -> Arraylist , Linkedlist
Queue -> Dequeu
Set -> Hash Set , Linked Hash Set
Collection API -> Map

I can use ->  Collection<Integer> nums = new ArrayList<Integer>();
But if there is work related to list then -> List<Integer> nums = new ArrayList<Integer>();
                    coz it have get functions also and many more than collection 
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(21);
        nums.add(13);
        nums.add(90);


        for(int n : nums){
            System.out.println(n);
        }

        System.out.println();

        System.out.println(nums.indexOf(13)); //will give the index of 13 in list 
        System.out.println(nums.get(2));
    }
}
