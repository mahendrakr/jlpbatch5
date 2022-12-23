package controlflow;

public class SwitchDemo {
	public static void main(String[] args) {
		String fruit="orange";
		switch(fruit) {
		case "apple":{System.out.println("take your apple");
		break;
		}
		case "orange":{System.out.println("take your orange");
		break;
		}
		case "banana":{System.out.println("take your banana");
		break;
		}
		default :{System.out.println("sorry all fruits are consumed");}
		
		}
	}

}
