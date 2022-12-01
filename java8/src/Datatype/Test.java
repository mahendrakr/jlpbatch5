package Datatype;

public class Test {
public static void main(String[] args) {
Student s=new Student();
System.out.println(s.id);
System.out.println(s.age);
System.out.println(s.branch);
System.out.println(s.isMarried);
System.out.println(s.section);
System.out.println(s.phoneNo);
System.out.println(s.name);
Address address = s.address;
System.out.println(address.houseNo);
System.out.println(address.city);
System.out.println(address.pinCode);
System.out.println(address.state);
System.out.println(address.postOffice);
College c=s.college;
System.out.println(c.city);
System.out.println(c.id);
System.out.println(c.name);


}

}
