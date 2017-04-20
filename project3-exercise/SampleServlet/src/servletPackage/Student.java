package servletPackage;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Student> getStudent(){
		List<Student> listStudent = new ArrayList<>();
		Student student = new Student();
		student.setId(1);
		student.setName("Leonardus Dani Novianto");
		listStudent.add(student);
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Ardi Pratama");
		listStudent.add(student1);
		return listStudent;
	}
	
}
