package inheritance;

public interface MyInterface {
     //  int a;
     //  static int b;
       static int c=20;
     public default void m1() {}//java8 onwards
    // private default void m2() {}
    // protected default void m1() {}
    public strictfp static void m3() {}//pss(public,static,strictfp)
}

