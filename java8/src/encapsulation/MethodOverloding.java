package encapsulation;
/**
 * rules of method overloding 
 * 1.method name must be same 
 * 2.method arguments must be diffrent 
 *      case1.number of argument may be diffrent
 *      case2. order of argument may be diffrent
 *      case3. type of argument may be diffrent
 * 3.there is no constraint about return type 
 * 4. there is no constraint about modifiers
 *      
 * @author K L Bopche
 *
 */
public class MethodOverloding {
public void m1() {
	System.out.println("no argumented");
}
//private void m1(int a){
//	System.out.println("one argumented int");
//}
public void m1(String b){
	System.out.println("one argumented String");
}
public void m1(int a ,String b){
	System.out.println("two argumented int,String");
}
public int m1(String a, int b) {
	System.out.println("two argumented String,int");
	return 10;
}
//public void m1(long a) {
	//System.out.println("one argumented long");
//}
//public void m1(double b) {
	//System.out.println("one argumented double");
//}
//public void m1(Integer a ) {
	//System.out.println("one argumented integer");
//}
public void m1(Long b) {
	System.out.println("wrapper long");
}
//public void m1 (int...b) {
	//System.out.println("var-arg");
//}
public void m1 (Object o) {
	System.out.println("Object argument");
}
public static void main(String[] args) {
	MethodOverloding m= new MethodOverloding();
	m.m1(10);
	
}
}
