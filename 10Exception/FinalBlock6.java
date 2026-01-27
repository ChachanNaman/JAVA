public class FinalBlock6 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally
        {//irrespective of if you got the exception or not it will execute the final block
            System.out.println("BYE");
        }
    }
}
