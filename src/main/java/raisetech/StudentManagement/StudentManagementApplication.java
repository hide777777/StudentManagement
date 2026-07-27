package raisetech.StudentManagement;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	//private String name = "tanaka tarou";
	//private String age = "37";
	@Autowired
	private StudentRepository repository;


//	private Map<String, String> students = new HashMap<>();
//
//			public StudentManagementApplication(){
//				students.put("tanaka tarou","37");
//				students.put("sato hanako","25");
//			}



	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);

		//public class Student {
			//private String name;
			//private int age;

		//};
	}

	@GetMapping("/student")
	public String getStudentInfo(@RequestParam("name") String name) {
		Student student = repository.searchByName(name);
		return student.getName() + " " + student.getAge() + "歳";
	}

	//@PostMapping("/studentInfo")
	//public  Map<String, String> getStudentInfo(){
		//return students;
	//}

	@PostMapping("/student")
	public String registerStudent(String name, int age) {
		repository.registerStudent(name, age);
		return name + "(" + age + "歳）を追加しました";
	}

	@PatchMapping("/student")
	public void updateStudentName(String name, int age) {
		repository.updateStudent(name, age);
	}

	@DeleteMapping("/student")
	public void deleteStudent(String name) {
		repository.deleteStudent(name);
	}
}