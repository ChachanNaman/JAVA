class school{
    private int age ;
    private String name;


    public school(){//Constructor -> whenever assign a value by default , assign in it 
        System.out.println("inside constructor");
        age = 19;
        name = "GOAT";
    }

    public school(int age , String name){ //Parameterized constructor
        this.age = age;
        this.name = name;
    }

    public void setage(int a){
        age = a;
    }
    public void setname(String n){
        name = n;
    }

    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
}

public class Private2{

    public static void main(String a[]){

        new school();              //annonymus object-> can be used once only
        school obj1 = new school();
        // obj1.setage(19);
        // obj1.setname("Naman");
        school obj2 = new school(12, "Ajay");
        System.out.println(obj1.getage() + " : " + obj1.getname());
        System.out.println(obj2.getage() + " : " + obj2.getname());

    }
}