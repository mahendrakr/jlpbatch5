package exception;

public class Test {
	
	private int count=0;
	public void m1(int a,int b) {
		try{
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
		
	}
	  

	public static void main(String[] args) {
		Test t=new Test();
		t.m1(10,0);
     System.out.println(t.count);
	}

}
