public class Demo1{
    // Single Inheritance => called PaidCalc3 and PaidCalc3 inherits class of Calc2 -> extends Calc2
    // Multilevel Inheritance => called PaidCalc3 in AdvCalc4 (soo AdvCalc4 have classed of PaidCalc3 , Calc2 )
    public static void main(String a[]){
        AdvCalc4 obj = new AdvCalc4();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(4,3);
        int r3 = obj.mul(2,3);
        int r4 = obj.div(3,3);
        double r5 = obj.power(4,2);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
    }
}