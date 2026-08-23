package Lec24;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student();
		s.name="Kaju";
		s.age=25;
		s.Intro_yourSelf();
//		System.out.println(s.name);
//		System.out.println(s.age);
		Student s1 = new Student();
		s1.name="Raj";
		s1.age=24;
		s1.Intro_yourSelf();
//		System.out.println(s1.name);
//		System.out.println(s1.age);
		s1.SayHey("Kamlesh");
		Student.Mentor_Name();
		Student s2 = new Student();
		s2.name="Riya";
		s2.age=-90;
	}
	static{
		System.out.println("Hello Hmm log static Blocks in Main");
	}

}
