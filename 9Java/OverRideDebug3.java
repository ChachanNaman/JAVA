@Deprecated  // used to tell that this is extended below somewhere
class A{
    public void iamprintingtheline(){
        System.out.println("in A show");
    }
}

class B extends A
{   
    // @Override    //compiler will give me the error in function name which i have to fix
    public void iamprintintheline(){
        System.out.println("in B show");
    }
}


public class OverRideDebug3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.iamprintingtheline();
    }
    
}
