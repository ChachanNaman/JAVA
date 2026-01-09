
public class Ternary{

    public static void main(String a[]){
        int x = 6;
        int result = 0;

        // if(x%2 == 0){
        //     result = 20;
        // }
        // else{
        //     result = 50;
        // }

        //Ternary Operators -> ?: -> if true ? print this : else print this

        result = x%2==0 ? 20 : 50;

        System.out.println(result);
    }
}