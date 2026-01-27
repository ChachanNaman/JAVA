//₹:₹/&/
@FunctionalInterface
interface A{
    int add(int i, int j);
}
public class FunctionalInterfaceReturn5 {
    public static void main(String[] args) {
        A obj = (i,j) -> i + j;

        int result = obj.add(3,4);
        System.out.println(result);
    };
}
    

