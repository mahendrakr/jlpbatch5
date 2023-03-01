package encapsulation;

public class Methoddetails {

	
//components of a method
/**
 * 1.modifiers
 * 2.return type ( void, all primitive types8 +non primitive types (String,Student,College,etc))
 * 3. method name 
 * 4.return statement
 * note=1.to identify a method ,it must has() just after method name
 * note=2.if we put  semicolon  just after () then it is called as abstract method or method declaration 
 * note=3.if we put {} just after () then it is called as method definition 
 * note=4.method name + argument =method signature 
 
 */

//this method will not return any thing
	void m1() {}
//define a method which return string 
public String m2() {return "nikita";} 
// define a method which take two perameters of int and string type and will return double type 
double m3(int a,String b) {
	return 12;
	}
protected String getCity() {
	return "Bhopal";
}
String m4 (int a,String b, int c) {
	return b;
}
String getname(String name) {
	return name;
}
String m5 (String firstName ,String lastName) {
return firstName+lastName;
}
//
void m6(int a,int b) {
//return ;
}
//
public class car {
	private String carName;
	private String carColour;
	
	public void setcarName(String carName ) {
		this.setcarName(carName);
	}
	public void setcolour(String carcolour) {
	this.setcolour(carcolour);
	}
	
	
}

































}
