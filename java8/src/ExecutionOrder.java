
public class ExecutionOrder {
	static {System.out.println("static block2");}
int a=10;
int b=m2();
static int c=30;
static int d=m3();
{
	System.out.println("instance block");}
static {
	System.out.println("static block");
}
void m1() {
	System.out.println("m1");
}
int m2() {
	System.out.println("m2");
	return 50;
}
static int m3() {
	System.out.println(d);
	System.out.println( "m3");
	return 60;
}
static void m4 () {
	System.out.println("m4");
}
public static void main(String[] args) {
ExecutionOrder o =new ExecutionOrder();
System.out.println("main");
ExecutionOrder o1 =new ExecutionOrder();
} 
static {System.out.println("static block 3");}
ExecutionOrder(){System.out.println( "constructor ");}
}

