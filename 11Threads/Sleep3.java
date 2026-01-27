/*
To print in sequence we use sleep method 
and use Sleep in try catch block

 */

class A extends Thread{
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

class B extends Thread{
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

public class Sleep3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //but somewhere there will 2 hello consecutively or 2 hi consecutively
        //to avoid that we can use try catch block with sleep method in main too to optimise

        try {
            Thread.sleep(2);    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start(); 
        b.start();
    }
}
