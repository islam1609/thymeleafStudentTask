package SpringThymeleaf1.thymeleaf1.DB;

import java.util.ArrayList;

public class DBManager {
    private  static ArrayList<Student> students = new ArrayList<>();
    private  static Long id = 4L;

    static {
        students.add(new Student(1L,"Islam","Yernatuly",95,"A"));
        students.add(new Student(2L,"Temirlan","Yernatuly",96,"A"));
        students.add(new Student(3L,"Aslan","Bakytov",80,"B"));
    }

    public static ArrayList<Student> getAllStudents(){
        return students;
    }

    public static void addStudent(Student student){
        student.setId(id);
        if(student.getExam()>=90)
            student.setMark("A");
        else if(student.getExam()<=89 && student.getExam()>=75)
            student.setMark("B");
        else if(student.getExam()<=74 && student.getExam()>=60)
            student.setMark("C");
        else if(student.getExam()<=59 && student.getExam()>=50)
            student.setMark("D");
        else
            student.setMark("F");

        students.add(student);
        id++;
    }
}
