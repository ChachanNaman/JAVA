interface A{ //interface just tells the path of the function 
    //have to make another class defining all methods inside interface 
    //these methods are abstract methods by default in interface
    //to extends the interface we use 'implements'

    int age = 21;   //final and static -> can print in main with class name
    String city = "Pune";
    void show();
    void hello();
}
class B implements A{

    public void show() {
        System.out.println("in Show");
    }

    public void hello() {
        System.out.println("in Hello");
    }
    
}

public class Interface5 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.hello();
        System.out.println(A.age);
        System.out.println(A.city);
    }
}
//by default -> everty interface have public abstract methods
//as the values are final and static in interface i can directly print it by class reference not by obj

//interface interface can be extended not abstract classes 
//