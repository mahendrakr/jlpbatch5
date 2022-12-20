package controlflow;

public class ElseIfStatement {
	public static void main(String[] args) {
		int age=30;
		if(age>=60)
			System.out.println("senior citizen");
	else if(age>=18 &  age<60)
			System.out.println("adult");
		else 
			System.out.println("child");
		
	}

}
