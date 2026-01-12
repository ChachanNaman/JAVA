class student {
    int rollno;
    String name;
    int phoneno;
}

public class ClassArray3{

    public static void main(String a[]){

        student st1 = new student();
        student st2 = new student();
        student st3 = new student();
        st1.rollno = 12;
        st1.name = "Naman";
        st1.phoneno = 1234;
        st2.rollno = 22;
        st2.name = "Swapnil";
        st2.phoneno = 5678;
        st3.rollno = 33;
        st3.name = "Saniya";
        st3.phoneno = 9123;

        student students[] = new student[3];
        // for(int i = 0; i < students.length ; i++){
            
        // }
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + "    " + students[i].rollno + "    " + students[i].phoneno);
        }

    }
}