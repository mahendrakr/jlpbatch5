/**
 * syntax
 *  [ access modifier] [non access modifier] <return type> <name>(){}[;]
 
 * @author ASUS
 *
 */
public class Methods {
public final void m1() {};
public static void m2() {};	
public strictfp void m3() {};
public synchronized void m4() {};
public static void m5() {
	System.out.println("method m5()");
};
public void m6() {
	System.out.println("method m6()");
};

public static void main(String[] args) {
	Methods.m5();
	m5();
	
	Methods m=new Methods();
	m.m6();
	
}

}


