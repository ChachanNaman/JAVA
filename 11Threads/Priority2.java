/*
We can give the threads a priority using setPriority() method of Thread class.
Priority can be Maximum(10), Minimum(1) and Normal(5).
    The default priority of a thread is Normal(5).
    Higher the priority number, higher is the priority of the thread.
    But it depends on OS whether to consider priority or not.
a.setPriority(Thread.MIN_PRIORITY); //1
b.setPriority(Thread.MAX_PRIORITY); //10
 */
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

public class Priority2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setPriority(Thread.MIN_PRIORITY); //1  
        b.setPriority(Thread.MAX_PRIORITY); //10// here os will give more time to b thread as it has more priority


        a.start(); 
        b.start();
    }
}
