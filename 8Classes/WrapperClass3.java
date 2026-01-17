public class WrapperClass3 {
    public static void main(String[] args) {
        int num = 7; //Primitive Value
        // Integer num1 = new Integer(num); 
        // took a primitive value and stored in wrapped object or class
        // This is called boxing 

        Integer num1 = num; //autoboxing -> when num is automatic converted to object num1 
        System.out.println(num1);

        int num2 = num1;  //auto-unboxing -> when object unboxed again to integer 
        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str); //now string is converted to int 
        System.out.println(num3*3);


    }
}
