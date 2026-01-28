/*
Set stores the unique value 
Set stores the values in random order , not in the order added 

*/

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
     // Set <Integer> nums = new HashSet<Integer>(); //HashSet will arrange in random order
        Collection <Integer> nums = new TreeSet<Integer>();  //TreeSet will arrange in sorted order

        nums.add(12);
        nums.add(2);
        nums.add(23);
        nums.add(14);
        nums.add(14);

        //Also Collection is part of Iterator means i can iterate straight using that Iterator 
        Iterator<Integer> value = nums.iterator();
        while (value.hasNext()) {
            System.out.println(value.next()); 
        }

        System.out.println();
        
        for(int n : nums){
            System.out.println(n);
        }
    }
}
