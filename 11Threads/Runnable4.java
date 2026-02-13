/*
we can use runnable interface to create thread instead of by extending from Thread
for runnable i have to create object from Runnable
and then passing that object to Thread class constructor ----
and then call start method on thread class object coz start method is of thread not of runnable class
*/
class A implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnable4 {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); 
        t2.start();
    }
}
