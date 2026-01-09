
public class NewSwitchCase
{
    public static void main(String a[]){
        
        String day = "Tuesday";
        String result = "";

        //instead of using break statement , we can use now '->'

        result = switch(day){
            case "Saturday" , "Sunday" -> "11am";
            case "Monday"  -> "8am";
            default -> "7am";
        };


        System.out.println(result);
    }
}