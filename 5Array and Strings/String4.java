/*
Mutable Strings - Something which can be changed 
Immutable Strings - Something which cant be changed 
Immutable Strings is deafult in Java
*/

public class String4{

    public static void main(String a[]){
        String name = new String("Naman");

        System.out.println("name");

        System.out.println(name.hashCode());

        System.out.println(name.length());


        String name1 = "Naman";  //have alloacted memory in heap and pointed from stack 
        //name1 in heap -> Naman
        name1 = name1+ " Chachan"; //name in stack changed to new memory allocated in heap 
        //new name1 in heap -> Naman Chachan

        System.out.println(name1);

        String name2 = "Karan";
        String name3 = "Karan";
        //both name2 and name3 point to same memory location in string pool


    }
}