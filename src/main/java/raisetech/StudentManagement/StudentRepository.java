package raisetech.StudentManagement;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM students")
  List<Student> searchStudent();

  @Select("SELECT * FROM students_courses")
  List<StudentCourses> searchStudentCourses();

//  @Insert("INSERT INTO student (name, age) VALUES (#{name}, #{age})")
//  void registerStudent(String name, int age);
//
//  @Update("UPDATE student SET age = #{age} WHERE name = #{name}")
//  void updateStudent(String name, int age);
//
//  @Delete("DELETE FROM student WHERE name = #{name}")
//  void deleteStudent(String name);
}
