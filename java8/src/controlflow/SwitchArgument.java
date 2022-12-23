package controlflow;

public class SwitchArgument {
	public static void main(String[] args) {
		int i=65;
		Integer i1=10;
		char c=20;
		Character ch='A';
		final byte b=30;
		Byte b1=40;
		short s=20;
		Short s1=30;
		String st="Amit";
		switch(b) {
		case 10:{System.out.println("hello");
		break;
		}
		case 20:{System.out.println("sharad");
		break;
		}
		case 30:{System.out.println("nikita");
		break;
		}
		case 40:{System.out.println("riya");
		break;
		}
		default :{System.out.println("bye");
		}
		
		}
		char c2='A';
		int x=c2;
		System.out.println(x);
		
		
	}

}
