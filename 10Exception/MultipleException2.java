

public class MultipleException2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]); //i am trying to access out of the bound from an array
            // i will make 2 catch blocks -> one for j=18/i and one for nums[5]
        }
        catch(ArithmeticException e){ //ArithmeticException for j=18/i 
            System.out.println("Its okay !");
        }
        catch(ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException for nums[5]
            System.out.println("Out of the bound sorry !");
        }
        catch(Exception e){ //Exception is the top most class of all 
            System.out.println("There is some error !");
        }
        
        System.out.println(i);
        System.out.println("end");
    }
}


/*
Exception -> 
Unchecked Exception(those in which i have control to handle or now) -> Runtime Exception
Checked Exception(those are necessary to get controlled) -> SQL exception, IO exception
Runtime Exception -> ArithmeticException, ArrayIndexOutOfBoundsException,Null 


*/

