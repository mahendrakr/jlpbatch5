package operator;

import Datatype.Student;

/**
 * >,<,>=,<=
 * relational operators are applicable only to primitive data type (except boolean)
 * note:relational operators are not applicable to reference type (object)
 * @author prtks
 *
 */
public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println(10>=10);
		Student s1=new Student();
		Student s2=new Student();
		System.out.println(s1>s2);//compilation error because relational operators are 
		//applicable only to primitive data type
	}

}
