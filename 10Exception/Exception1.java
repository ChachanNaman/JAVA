

public class Exception1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("Its okay !");
        }
        
        System.out.println(i);
        System.out.println("end");
    }
}
