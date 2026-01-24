class A{
    public void show() throws ClassNotFoundException    
    //it will trow exception to main to look for it and main have to make throw catch for it
    {
        Class.forName("Calc");
    }
}


public class DuckingException4 {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
