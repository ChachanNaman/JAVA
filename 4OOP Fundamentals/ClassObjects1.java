/*
To run the Byte Code JVM helps
but to provide all necessary classes , files JRE helps JVM in that 


*/


class calculator{
 
    public int add(int n1 , int n2){
        int result = n1+n2;
        System.out.println(result);
        return 0;
    }

}


public class ClassObjects1{

    public static void main(String a[]){
        int nums1 = 3;
        int nums2 = 2;


        calculator calc = new calculator();
        int result = calc.add(nums1 , nums2);

        System.out.println(result);
    }
}