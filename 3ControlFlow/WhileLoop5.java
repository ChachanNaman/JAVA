public class WhileLoop5{

    public static void main(String a[]){
        int i = 1;

        while(i <= 5){
            System.out.println("Naman" + i);
                int j = 1;
                while(j <= 3){
                    System.out.println("Hello" + j);
                    j++;
                }
            i++;
        }
    }
}