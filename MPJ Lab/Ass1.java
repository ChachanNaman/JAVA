
class triangle {
    double base, height, a;

    double area (double b , double h){
        a = 0.5 * b * h;
        return a;
    }
}
public class Ass1 {
    public static void main(String[] args) {
        triangle t1 = new triangle();
    triangle t2 = new triangle();

    double a1 = t1.area(10,20);
    double a2 = t2.area(40,20);

    System.out.println("Area : " + a1);
    System.out.println("Area : " + a2);
    }  

}
