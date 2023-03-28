package inheritance;

public class Nikita implements Speakable,Danceable {

	@Override
	public void dance() {
     System.out.println("classic dance");		
	}

	@Override
	public void speak() {
      System.out.println("English");		
	}

}
