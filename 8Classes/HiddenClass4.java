class A{
    public void show(){
        System.out.println("IN A class");
    }
}
abstract class B{
    public abstract void show1();
}
public class HiddenClass4 {
    public static void main(String[] args) {
        A obj = new A(){   //this is the hidden class and will show output of this only , not of upper defined class 
            public void show(){
                System.out.println("IN new hidden class");
            }
        };
        obj.show();


        B obj1 = new B(){
            public void show1(){
                System.out.println("IN B class");
            }
        };

        obj1.show1();

    }
}

//We can use hidden class to deal with  abstract class


