import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class students {
    int age ; 
    String name;

    
    public students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "studens [age=" + age + ", name=" + name + "]";
    }

}
public class Problem5 {
    public static void main(String[] args) {
        Comparator<students> com = new Comparator<students>() {
            public int compare(students i, students j){
                if(i.age > j.age){
                    return 1; 
                }
                else{
                    return -1;
                }
            }
        };
        List<students> studs = new ArrayList<>();
        studs.add(new students(12, "NAMAN"));
        studs.add(new students(3, "JAIN"));
        studs.add(new students(34, "gupta"));
        studs.add(new students(11, "swapnil"));
    
        Collections.sort(studs, com);
        for(students s : studs){
            System.out.println(s);
        }
    }
   

}
