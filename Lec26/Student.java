package Lec26;

public class Student {
	String name = "Raj";
	int age = 22;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String s, int age) {
		// TODO Auto-generated constructor stub
		this.name = s;
		this.age = age;
	}
	@Override
	public String toString() {
		return  name+" "+age;
	}

}
