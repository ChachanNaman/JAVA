enum status{//Class
    running , failed , pending , success;  //Objects
}


public class Enum1{
    public static void main(String[] args) {

        // BASICS -> 
        // status s = status.success;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // status[] ss = status.values(); //all objects stored in an array
        // for(int i = 0; i <4; i++){
        //     System.out.println(ss[i]);
        // }


        status s = status.pending;
        switch (s) {
            case running:
                System.out.println("Fine");
                break;
            case pending:
                System.out.println("dikat");
                break;
            case failed:
                System.out.println("game end");
                break;
            default:
                System.out.println("done");
                break;
        }

        
    }
}