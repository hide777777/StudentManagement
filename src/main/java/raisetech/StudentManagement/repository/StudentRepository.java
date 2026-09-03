package raisetech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;

/**
 * 受講生情報を扱うリポジトリ。
 *
 * 全件検索や単一条件での検索、コース情報の検索が行えるクラスです。
 */

@Mapper
public interface StudentRepository {

  /**
   * 全件検索します。
   *
   * @return 全件検索した受講生情報の一覧
   */

  @Select("SELECT * FROM students")
  List<Student> searchStudent();

  @Select("SELECT * FROM students_courses")
  List<StudentCourses> searchStudentCourses();


  @Options(useGeneratedKeys = true, keyProperty = "id")

  @Insert("INSERT INTO students(name, kana_name, nickname, email, area, age, sex, remark) "
      + "VALUES (#{name}, #{kanaName}, #{nickname}, #{email}, #{area}, #{age}, #{sex}, #{remark})")
  void registerStudent(Student student);

  @Insert("INSERT INTO students_courses(student_id, course_name)"
  + "VALUES (#{studentId}, #{courseName})")
  void registerStudentCourses(StudentCourses StudentCourses);
}
