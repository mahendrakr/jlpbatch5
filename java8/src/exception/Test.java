package exception;

public class Test {
	
	private int count=0;
	public void m1(int a,int b) {
		try{
			System.out.println("before division from m1");
			int r=a/b;
			count++;
		}
		catch(Exception e) {
			e.printStackTrace();
			count++;
		}
		finally {
			count++;
		}
	System.out.println("after division from m1");	
	}
	public void m2(int a,int b) {
   System.out.println("before division");
			int r=a/b;
			count++;
	System.out.println("after division");			
	}
	  

	public static void main(String[] args) {
		Test t=new Test();
		t.m1(10,0);
		t.m2(10,0);
     System.out.println(t.count);
	}

}
