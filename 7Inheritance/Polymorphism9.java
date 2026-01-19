/*
Polymorphism -> Changing Behaviour depending upon the surrounding 
Polymorphism have 2 types -> 
1) Compile time -> which method have to be executed first decided in Compile Time => Overloading 
2) Run time -> decided after execution which method have to be called => Overriding 
*/

//POLYMORPHISM ->
class A{
    public void show(){
        System.out.println("In A Class");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Class");
    }
}
class C extends A{
    public void show(){
        System.out.println("IN C Class");
    }
}


public class Polymorphism9{
    public static void main(String a[]){
        A obj = new A();  //obj is referenced to A but i can create object of any class that inherits class A
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}