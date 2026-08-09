package raisetech.StudentManagement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
  private String id;
  private String name;
  private String kanaName;
  private String nichname;
  private String email;
  private String area;
  private int age;
  private String sex;

/*  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }*/
}
