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
		
		Student student2 = new Student();
		student2.setId(3);
		student2.setName("Bintoro Adi Guna");
		listStudent.add(student2);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Bintoro Adi Guna");
		listStudent.add(student3);
		
		return listStudent;
	}
	
}
