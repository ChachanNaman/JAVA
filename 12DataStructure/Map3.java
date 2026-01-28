
import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Naman", 23);
        students.put("Gupta", 34);
        students.put("Swapnil", 92);
        students.put("Jain", 89);

        System.out.println(students.keySet());
        System.out.println(students.values());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

    }
}
