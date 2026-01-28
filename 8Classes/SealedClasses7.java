/*
Once the class is sealed , final, non-sealed its cant be inherited by another classes 
To inherit sealed , final, non-sealed class , have to give permit to specific classes
And permitted classes must be sealed , final, non-final classes and extends Parent class

In sealed class i can give permit 
But in final class i cant give any permit 
Non Sealed classes can be extended by any class normally 

For classes there can be 3 options after permit sealed , final, non-sealed  class
For interface there can be 2 options after permit sealed and non-sealed
 */

sealed class A permits B,C{

}
final class B extends A{

}
non-sealed class C extends A{

}
class D extends C{

}

sealed interface X permits Y{

}
non-sealed interface Y extends X{
    
}

public class SealedClasses7 {
    public static void main(String[] args) {
        
    }
}
