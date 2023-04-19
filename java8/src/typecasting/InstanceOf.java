package typecasting;
/**
 * instanceof operator will check some relation.either it should be same type of specified
 * class/interface or derived type of specified class
 * e.g. a instanceof A 
 * for reference follow InstanceOf and K class
 * @author prtks
 *
 */
public class InstanceOf {
	public static void main(String[] args) {
		A a=new C();
		K k=new K();
		k.m1(a);
	}

}
