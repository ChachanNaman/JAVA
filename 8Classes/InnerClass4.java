class A{
    public void show(){
        System.out.println("In A class");
    }

    class B{  
    // we can make innerclass static also -> static class B{} and in main i have to call like 
    //  A.B obj1 = new A.B();
        public void show1(){
            System.out.println("In B class");
        }
    }
}
//dddd

public class InnerClass4 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        //now as if B is subclass of A class then
        A.B obj1 = obj.new B();  //must be under obj 
        obj1.show1();
    }
}
