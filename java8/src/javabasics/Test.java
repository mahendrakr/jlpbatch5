package javabasics;
import pack1.Student;
//import pack2.*;
import pack2.Cat;
import pack2.Cow;
import pack2.Rat;
import static pack3.pack4.Dog.id;
import static pack3.pack4.Dog.age;
import static pack3.pack4.Dog.t;
import static java.lang.System.out;
public class Test {
public static void main(String[] args) {
	pack2.Teacher t= new pack2.Teacher();
pack2.Student s= new pack2.Student();
	pack3.pack4.Dog d = new pack3.pack4.Dog();
	Cat c= new Cat();
	Cow w= new Cow();
	Rat r= new Rat();
	Student s2= new Student();
	t.m2();
	int a=t.m1();
	System.out.println(a);
//int id=	pack3.pack4.Dog.id;

System.out.println(id);
System.out.println(age);
System.out.println(t.m1());
out.println("Sharad");
} 

}

