/*
Mutatioon - its the process of changing the behaviour of code by making small changes in it
We are trying to change the code with 2 thread parelly 
And its recommended to run one mutation at a time to see its effect properly
Thread Safe - a piece of code that to executed once at a time from multiple threads 
synchronized keyword is used to make a method thread safe 
*/

/*
Thread States -> 
NEW -> start() -> RUNNABLE -> run() -> RUNNING -> sleep() -> WAITING -> notify() -> RUNNABLE -> run() -> TERMINATED -> stop() -> DEAD
*/

class counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
class A implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            counter counter = new counter();
            counter.increment();
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            counter counter = new counter();
            counter.increment();
        }
    }
}

public class Mutation5 {
    public static void main(String[] args) throws InterruptedException {

        counter counter = new counter();

        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); 
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(counter.count);
    }
}
