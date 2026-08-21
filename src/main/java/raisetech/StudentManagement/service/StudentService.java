package raisetech.StudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;
import raisetech.StudentManagement.repository.StudentRepository;
import java.util.ArrayList;

@Service

public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    return repository.searchStudent();
//    List<Student> allStudents = repository.searchStudent();
//    List<Student> result = new ArrayList<>();
//
//    for (Student student : allStudents) {
//      if (student.getAge() >= 30 && student.getAge() < 40) {
//        result.add(student);
//      }
//    }
//    return result;
//    repository.serch30-39();
//    if serch30-39 age>30;
//    else serch30-39 age<40;
//    plintln(serch30-39);
//
//    return repository.searchStudent();
  }

  public List<StudentCourses> searchStudentCoursesList() {
    return repository.searchStudentCourses();
//    List<StudentCourses> allCourses = repository.searchStudentCourses();
//    List<StudentCourses> result = new ArrayList<>();
//
//    for (StudentCourses course : allCourses) {
//      if (course.getCourseName().equals("Javaコース")) {
//        result.add(course);
//      }
//    }
//    return result;
  }
}
