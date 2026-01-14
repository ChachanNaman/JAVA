class school{
    private int age ;
    private String name;

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

        school obj1 = new school();
        obj1.setage(19);
        obj1.setname("Naman");

        System.out.println(obj1.getage() + " : " + obj1.getname());

    }
}