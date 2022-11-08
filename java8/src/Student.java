
public class Student {
	public String name="Sharad";
	public int age=19;
	public static String university="RGPV";
	public int studentId=157;
	public static String branch="CS";
	public String collegeName="LNCT";
	public static int YearOfAdmission=2021;
	public static int Phone=1234567890;
	public int dob=12/12/2002;
	
	
	public static void main(String[] args) { 
		System.out.println(Student.university);
		System.out.println(Student.branch);
		System.out.println(YearOfAdmission);
		System.out.println(Phone);
		
		Student s= new Student();
				
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.collegeName);
		System.out.println(s.studentId);
		System.out.println(s.dob);
		
		}
	}
