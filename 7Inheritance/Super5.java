class A
{
    public A()
    {
        super();  //if super of child class is called without parametrised then this constructor get called
        System.out.println("In A");
    }
    public A(int n)
    {
        super();  //if super of child class is called parametrised one then this constructor is called
        System.out.println("in int A");
    }
}

class B extends A
{
    public B()
    {
        super();      //called by this() -> then it will call class A
        System.out.println("In B");
    }
    public B(int n){
        // super(n);
        this();     //will call the constructor of its class first then -> In A -> In B -> in int B
        System.out.println("in int B");
    }
}

public class Super5{
    public static void main(String a[]){
        B obj = new B(22);//if i pass value inside this then both parametrised get called 
    }
}