

public class ThrowError3 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        

        try{
            j = 18/i;
            if(j==0){ 
                throw new ArithmeticException();
                //it will make force to throw error andprint catch statement 
            }
        }
        catch(ArithmeticException e){ //ArithmeticException for j=18/i 
            System.out.println("Its okay !");
        }
        catch(Exception e){ //Exception is the top most class of all 
            System.out.println("There is some error !");
        }
        
        System.out.println(i);
        System.out.println("end");
    }
}


