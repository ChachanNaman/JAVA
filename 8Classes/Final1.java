class Calc{ 
    public final void show(){
        System.out.println("Naman");
    }
    public void add(int x , int y){
        System.out.println(x+y);
    }
}
//Final -> variable : if i want to make variable constant -> final int marks = 8;
//          class : if i dont want to inherit my class  -> final class Calc
//          method : if i dont want to override one function in my class (to prevent overriding ) -> public final void show(){}
//finalll
class AdvCalc extends Calc {
    public void show(){ 
        System.out.println("Naman");
    }
    public void add(int x , int y){
        System.out.println(x+y);
    }
}

public class Final1{
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        obj.show();

///hello jii
    }
}