package raisetech.StudentManagement;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	//private String name = "tanaka tarou";
	//private String age = "37";

	private Map<String, String> students = new HashMap<>();

			public StudentManagementApplication(){
				students.put("tanaka tarou","37");
				students.put("sato hanako","25");
			}



	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);

		//public class Student {
			//private String name;
			//private String age;

		//};
	}

	@GetMapping("/studentInfo")
	public Map<String, String> getStudentInfo() {
		return students;
	}

	//@PostMapping("/studentInfo")
	//public  Map<String, String> getStudentInfo(){
		//return students;
	//}

	@PostMapping("/studentName")
	public String setStudentInfo(String name, String age) {
		students.put(name, age);
		return name + "(" + age + "歳）を追加しました";

	}
}
