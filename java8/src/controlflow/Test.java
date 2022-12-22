package controlflow;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student("Nikita",70,76,83);
		boolean result = Eligible.isEligible(s1);
	//	System.out.println(result);
		if (result) {
			System.out.println(s1.name+" is eligible ");
		}
		else {
			System.out.println(s1.name+" is not eligible ");
		}
	}

}
