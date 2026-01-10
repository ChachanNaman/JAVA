/*
Stack will have main and mobileapp and all variables 
Heap will contain int num = 5; and getmepen(2);
Heap contain those objects which and not in anywhere
and Stack contains pointer to Heap location of those memory parts
*/


class MobileApp{

    int num = 5; 

    public void playmusic(){
        System.out.println("Music playing...");
    }

    public String getmepen(int cost){
        if(cost >= 10){
            return "PEN";
        }
        else{
            return "Nothing-Bye";
        }
    }
}


public class ClassMethods2{

    public static void main(String a[]){
        MobileApp app = new MobileApp();
        app.playmusic();
        String pen = app.getmepen(2);
        System.out.println(pen);
    }

}