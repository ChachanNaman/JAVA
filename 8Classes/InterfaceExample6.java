
interface computer{
    public abstract void code();
}

class Laptop implements computer{
    public void code(){
        System.out.println("code, compile, run : slower ");
    }
}

class Desktop implements computer{
    public void code(){
        System.out.println("code, compile, run : faster ");
    }
}

class Developer{
    public void show(computer obj){
        obj.code();
    }
}

public class InterfaceExample6 {
    public static void main(String[] args) {
        computer desk = new Desktop();
        computer lap = new Laptop();

        Developer naman = new Developer();
        naman.show(lap);
        naman.show(desk);
    }
}



