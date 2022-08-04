package SpringThymeleaf1.thymeleaf1.Controllers;

import SpringThymeleaf1.thymeleaf1.DB.DBManager;
import SpringThymeleaf1.thymeleaf1.DB.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public  String index(Model model){
        ArrayList<Student> students = DBManager.getAllStudents();
        model.addAttribute("students",students);
        return "homePage";
    }
    @GetMapping(value = "/addStudent")
    public String addStudent(){
        return "addStudent";
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(@RequestParam(name = "studentName") String name,
                             @RequestParam(name = "studentSurname") String surname,
                             @RequestParam(name = "studentExam") int exam){

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);

        DBManager.addStudent(student);

        return "redirect:/";
    }
}
