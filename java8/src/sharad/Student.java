package sharad;
public class Student {
	public String name="Sharad";
	public int age=19;
	public static String university="RGPV";
	public int studentId=0157;
	public static String branch="CS";
	public String collegeName="LNCT";
	
	public static void main(String[] args) { 
		System.out.println(Student.university);
		System.out.println(Student.branch);
		
		Student s= new Student();
				
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.collegeName);
		System.out.println(s.studentId);
		
		
	}
	
	


}
