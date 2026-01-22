/*
3 types of interface -> Normal, Functional(SAM -> single abstract method),Marker

Normal -> when i have 2 or more methods i use normal interface 
Functional -> if we have only 1 interface then its called SAM 
Marker -> which has no methods ,, blank inter face
        in this there is serialisation(when we are storing in heap mermory)
                        deserialisation(when we are loading back from heap memory)
*/

@FunctionalInterface
interface A{
    void show(int i);
}
public class Functionalinterface4 {
    public static void main(String[] args) {

        //Lamba Expression only works with Functional Interface
        A obj = (int i) -> System.out.println("in show" + i);
        
        /*   Replaced the whole Line of code with : () -> 
        // new A(){ 
        //  public void show(){ }
         */
        obj.show(3);
    };
         
}
    

