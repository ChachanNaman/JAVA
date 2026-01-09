
public class SwitchCase{

    public static void main(String a[]){
        int n = 10;

        switch(n){
            case 1 : 
                System.out.println("Monday");
                break; //break added otherwise it will print all lines after that case
            case 2 : 
                System.out.println("Tuesday");
                break;
            case 3 : 
                System.out.println("Wednesday");
                break;
            case 4 : 
                System.out.println("Thursday");
                break;
            case 5 : 
                System.out.println("Friday");
                break;
            case 6 : 
                System.out.println("Saturday");
                break;
            case 7 : 
                System.out.println("Sunday");
                break;
            default : 
                System.out.println("Enter a valid number ! ");
        }
    }
}