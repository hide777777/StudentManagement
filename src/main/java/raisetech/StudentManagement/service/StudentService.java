package raisetech.StudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;
import raisetech.StudentManagement.domain.StudentDetail;
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
  }

  public List<StudentCourses> searchStudentCoursesList() {
    return repository.searchStudentCourses();
  }

  public void registerStudent(StudentDetail studentDetail){
    Student student = studentDetail.getStudent();
    repository.registerStudent(student);

    for(StudentCourses course:
        studentDetail.getStudentsCourses()) {
      course.setStudentId(student.getId());
      repository.registerStudentCourses(course);
    }
  }
}
