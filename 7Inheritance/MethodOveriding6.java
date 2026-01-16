class Calc{
    public int add(int n1 , int n2){
        return n1+n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){  //Method Overriding -> 
                                    //if i create function of same name of parent class then 
        return n1+n2+1;            // during execution it execute child class function 

    }
}
public class MethodOveriding6{
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        int result =  obj.add(3,4);
        System.out.println(result);
    }
}


/*
import ->
import java.lang.* -> is a default java library
for a folder if we have to import then -> 
import.tools.* -> * means import all files in tools folder 
