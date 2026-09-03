package raisetech.StudentManagement.controller;

import jakarta.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.controller.converter.StudentConverter;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;
import raisetech.StudentManagement.domain.StudentDetail;
import raisetech.StudentManagement.service.StudentService;


@Controller
  public class  StudentController {

    private StudentService service;
    private StudentConverter converter;
    @Autowired
    public StudentController(StudentService service, StudentConverter converter) {
      this.service = service;
      this.converter = converter;
    }

    @GetMapping("/studentList")
    public String getStudentList(Model model) {
      List<Student> students = service.searchStudentList();
      List<StudentCourses> studentCourses = service.searchStudentCoursesList();

      model.addAttribute( "studentList", converter.convertStudentDetails(students,studentCourses));
      return "studentList";
    }

    @GetMapping("/studentCoursesList")
    public List<StudentCourses> getStudentCoursesList() {
      return service.searchStudentCoursesList();
    }

    @GetMapping("/newStudent")
    public String newStudent(Model model) {
      StudentDetail studentDetail = new StudentDetail();
      studentDetail.setStudent(new Student());

      List<StudentCourses> studentsCourses = new ArrayList<>();
      studentsCourses.add(new StudentCourses());
      studentDetail.setStudentsCourses(studentsCourses);

      model.addAttribute("studentDetail", studentDetail);
      return "registerStudent";
    }

    @PostMapping("/registerStudent")
    public String registerStudent(@ModelAttribute StudentDetail studentDetail, BindingResult result){
      if(result.hasErrors()){
        return "registerStudent";
      }
      // 新規受講生情報を登録する処理を実装する。
      // コース情報も一緒に登録できるように実装する。コースは単体で良い。
      service.registerStudent(studentDetail);




      return "redirect:/studentList";
    }
}




