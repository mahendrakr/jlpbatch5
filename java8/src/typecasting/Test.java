package typecasting;

public class Test {
   public static void main(String[] args) {
       A a=new C();
       B b=(B)a;
       b.m2();
       D d=(D)a;
       d.m4();
     B b1=new C();
 //D d1=(D)b1;
}
}
