class A{
    public void show1(){
        System.out.println("In A class");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B class");
    }
}

public class UpDownCasting2 {
    public static void main(String[] args) {
        
        A obj = new B();  
        // A obj = (A)new B();  -> Upcasting => B class ko boldia go to upper class A
// A is reference class if i try to do obj.show2() will throw error as A class doesnt know about B class 
        obj.show1();

        B obj1 = (B) obj;  //Downcasting -> We know that the obj is of A but downcast obj to class B 
        //now obj1 have stored obj 
        obj1.show2();

    }
}
