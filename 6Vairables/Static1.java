class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    {
        name = "Smartphone";
    }
    public mobile(){  //Constructor
        brand = "Samsung";
        price = 300;
        System.out.println("in constructor");
    }

    //we can use static variable in static function , not non static variables 
    public static void show1(mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
    }

}
public class Static1{
    public static void main(String a[]){

        // mobile.name =  " Smartphone";  //static value defined here with class name, not object name

        mobile obj1 = new mobile(); 
        obj1.brand = "Apple";
        obj1.price= 1500;


        mobile obj2 = new mobile();
        obj2.brand = "OnePlus";
        obj2.price = 1200;

        obj1.show();
        obj2.show();

        mobile.show1(obj1);
        mobile.show1(obj2);

    }
}