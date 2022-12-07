package sharad;

public class HomeWork {
	public static void main(String[] args) {
		StudentDetail s=new StudentDetail();
		System.out.println(s.name);
		System.out.println(s.studentId);
		System.out.println(s.branch);
		System.out.println(s.age);
		System.out.println(s.mobileNumber);
		
		CollegeDetail c=s.c;
		
		System.out.println(c.collegeName);
		System.out.println(c.collegeId);
		System.out.println(c.university);
		System.out.println(c.administration);
		System.out.println(c.collegeMobileNo);
	}

}
