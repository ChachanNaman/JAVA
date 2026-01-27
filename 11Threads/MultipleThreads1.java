/*
Thread are shared resources of a process.
One process can have multiple threads.
Each thread has its own stack memory but shares heap memory with other threads of the same process.

For multiple threads , i have to call the start() method on each thread object.
and have to extand the Class from Threads 
and have to make run function which contains the code to be executed by that thread.

And OS have scheduler which allows multiple threads to run on a single CPU by time slicing.
 */

//in this hi and hello will print parallelly coz class are extended by Thread
class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi"+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello "+i);
        }
    }
}
public class MultipleThreads1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start(); 
        b.start();
    }
}
