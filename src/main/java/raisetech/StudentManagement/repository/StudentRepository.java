package raisetech.StudentManagement.repository;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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


  //@Options(useGeneratedKeys = true, keyProperty = "id")

  @Insert("INSERT INTO students(name, kana_name, nickname, email, area, age, sex, remark, deleted) "
      + "VALUES (#{name}, #{kanaName}, #{nickname}, #{email}, #{area}, #{age}, #{sex}, #{remark}, false)")

  @Options(useGeneratedKeys = true, keyProperty = "id")
  void registerStudent(Student student);

  @Insert("INSERT INTO students_courses(student_id, course_name, start_date, end_date)"
    + "VALUES(#{studentId}, #{courseName}, #{startDate}, #{endDate})")
  void registerStudentCourses(StudentCourses studentsCourses);

  @Select("SELECT * FROM students WHERE id = #{id}")
  Student searchStudentById(String id);

  @Select("SELECT * FROM students_courses WHERE student_id = #{studentId}")
  List<StudentCourses> searchStudentCoursesByStudentId(String studentId);

  @Update("UPDATE students SET name=#{name},kana_name=#{kanaName},nickname=#{nickname}, "
    + "email=#{email}, area=#{area}, age=#{age}, sex=#{sex}, remark=#{remark}, telephone=#{telephone} "
    + "WHERE id=#{id}")
  void updateStudent(Student student);
}
